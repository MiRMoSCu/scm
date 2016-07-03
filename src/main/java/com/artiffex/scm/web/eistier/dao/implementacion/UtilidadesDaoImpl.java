package com.artiffex.scm.web.eistier.dao.implementacion;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.artiffex.scm.web.eistier.dao.interfaz.UtilidadesDao;

@Repository("utilidadesDao")
public class UtilidadesDaoImpl implements UtilidadesDao {
	
	private static final Logger log = Logger.getLogger(CostoCongresistaDaoImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;

	public Object buscaValorPorSQLQuery(String queryString) {
		Object obj = null;
		Session session = null;
		Transaction tx = null;
		SQLQuery query = null;
		try {
			try {
				session = this.sessionFactory.getCurrentSession();
			} catch ( HibernateException he ) {
				session = this.sessionFactory.openSession();
			}
			tx = session.beginTransaction();
			query = session.createSQLQuery(queryString);
			obj = query.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			if ( tx != null )
				tx.rollback();
			log.error(e.getMessage());
		} finally {
			query = null;
			tx = null;
			session = null;
		}
		return obj;
	}

}
