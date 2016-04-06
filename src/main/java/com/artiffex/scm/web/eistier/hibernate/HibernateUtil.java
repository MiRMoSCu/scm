package com.artiffex.scm.web.eistier.hibernate;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
//import org.hibernate.service.ServiceRegistry;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	
	private static final Logger log = Logger.getLogger(HibernateUtil.class);
	private static String SERVER_CONFIG_FILE_LOCATION 	= "hibernate/hibernate.cfg.xml";
	private static SessionFactory sessionFactory;
	//private static ServiceRegistry serviceRegistry;
	
	// constructor
	private HibernateUtil() { }	
	
	private static synchronized void initSessionFactory() {
		try {
			// CON XML para Hibernate 4
			/*
			Configuration configuration = new Configuration().configure(SERVER_CONFIG_FILE_LOCATION);
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
			sessionFactory = configuration.buildSessionFactory(builder.build());
			*/
			
			// CON ANOTACIONES para Hibernate 4 unicamente en modo standalone
			/*
			Configuration configuration = new Configuration();
			configuration.configure(SERVER_CONFIG_FILE_LOCATION);
			serviceRegistry = new StandardServiceRegistryBuilder()
									.applySettings(configuration.getProperties())
									.build();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			*/
			
			// CON ANOTACIONES para Hibernate 3 unicamente en modo web
			//Configuration configuration = new Configuration();
			//configuration.configure(SERVER_CONFIG_FILE_LOCATION);
			AnnotationConfiguration configuration = new AnnotationConfiguration();
			configuration.configure(SERVER_CONFIG_FILE_LOCATION);
			sessionFactory = configuration.buildSessionFactory();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static SessionFactory getInstance() {
		if (sessionFactory == null) {
			log.info("sessionFactory == null : true");
			initSessionFactory();
		}
		return sessionFactory;
	}
	
	public static void close() {
		if (sessionFactory != null)
			sessionFactory.close();
		sessionFactory = null;
	}

	public Session openSession() {
		return sessionFactory.getCurrentSession();
	}

	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

}
