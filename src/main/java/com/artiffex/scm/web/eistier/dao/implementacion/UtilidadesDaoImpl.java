package com.artiffex.scm.web.eistier.dao.implementacion;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.artiffex.scm.web.eistier.dao.interfaz.UtilidadesDao;
import com.artiffex.scm.web.eistier.hibernate.HibernateUtil;

@Repository("utilidadesDao")
public class UtilidadesDaoImpl implements UtilidadesDao {
	
	private static final Logger log = Logger.getLogger(CostoCongresistaDaoImpl.class);
	
	private Session session;

	public Object buscaValorPorSQLQuery(String queryString) {
		Object obj = null;
		Transaction tx = null;
		SQLQuery query = null;
		try {
			try {
				this.session = HibernateUtil.getInstance().getCurrentSession();
			} catch (HibernateException he) {
				session = HibernateUtil.getInstance().openSession();
			}
			tx = this.session.beginTransaction();
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
		}
		return obj;
	}

}
