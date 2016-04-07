package com.artiffex.scm.web.eistier.dao.implementacion;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.artiffex.scm.web.businesstier.entity.ParametroConfiguracion;
import com.artiffex.scm.web.eistier.dao.interfaz.ParametroConfiguracionDao;
import com.artiffex.scm.web.eistier.hibernate.HibernateUtil;

@Repository("parametroConfiguracionDao")
public class ParametroConfiguracionDaoImpl implements ParametroConfiguracionDao {
	
	private static final Logger log = Logger.getLogger(ParametroConfiguracionDaoImpl.class);
	
	private Session session;

	public ParametroConfiguracion buscaPorSQLQuery(String queryString) {
		ParametroConfiguracion parametroConfiguracion = null;
		Transaction tx = null;
		SQLQuery query = null;
		try {
			try {
				this.session = HibernateUtil.getInstance().getCurrentSession();
			} catch (HibernateException he) {
				this.session = HibernateUtil.getInstance().openSession();
			}
			tx = this.session.beginTransaction();
			query = session.createSQLQuery(queryString);
			parametroConfiguracion = (ParametroConfiguracion) query.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			log.error(e.getMessage());
		} finally {
			query = null;
			tx = null;
		}
		return parametroConfiguracion;
	}

}
