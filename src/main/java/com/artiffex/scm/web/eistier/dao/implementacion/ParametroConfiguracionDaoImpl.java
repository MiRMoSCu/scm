package com.artiffex.scm.web.eistier.dao.implementacion;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
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

	public int crea(ParametroConfiguracion parametroConfiguracion) {
		int id = 0;
		Transaction tx = null;
		try {
			try {
				this.session = HibernateUtil.getInstance().getCurrentSession();
			} catch (HibernateException he) {
				session = HibernateUtil.getInstance().openSession();
			}
			tx = this.session.beginTransaction();
			id = (Integer) this.session.save(parametroConfiguracion);
			tx.commit();
		} catch (Exception e) {
			if ( tx != null )
				tx.rollback();
			log.error(e.getMessage());
		} finally {
			tx = null;
		}
		return id;
	}

	public ParametroConfiguracion buscaPorCriteriaQuery(String criteria) {
		ParametroConfiguracion obj = null;
		Transaction tx = null;
		Query query = null;
		try {
			try {
				this.session = HibernateUtil.getInstance().getCurrentSession();
			} catch (HibernateException he) {
				session = HibernateUtil.getInstance().openSession();
			}
			tx = this.session.beginTransaction();
			query = session.createQuery(criteria);
			obj = (ParametroConfiguracion) query.uniqueResult();
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

	public void modifica(ParametroConfiguracion parametroConfiguracion) {
		Transaction tx = null;
		try {
			try {
				this.session = HibernateUtil.getInstance().getCurrentSession();
			} catch (HibernateException he) {
				session = HibernateUtil.getInstance().openSession();
			}
			tx = this.session.beginTransaction();
			session.update(parametroConfiguracion);
			tx.commit();
		} catch (Exception e) {
			if ( tx != null )
				tx.rollback();
			log.error(e.getMessage());
		} finally {
			tx = null;
		}
	}

	public void elimina(ParametroConfiguracion parametroConfiguracion) {
		Transaction tx = null;
		try {
			try {
				this.session = HibernateUtil.getInstance().getCurrentSession();
			} catch (HibernateException he) {
				session = HibernateUtil.getInstance().openSession();
			}
			tx = this.session.beginTransaction();
			session.delete(parametroConfiguracion);
			tx.commit();
		} catch (Exception e) {
			if ( tx != null )
				tx.rollback();
			log.error(e.getMessage());
		} finally {
			tx = null;
		}
	}

	@SuppressWarnings("unchecked")
	public List<ParametroConfiguracion> listaPorSQLQuery(String queryString) {
		List<ParametroConfiguracion> lista = new ArrayList<ParametroConfiguracion>();
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
			lista = query.list();
			tx.commit();
		} catch (Exception e) {
			if ( tx != null )
				tx.rollback();
			log.error(e.getMessage());
		} finally {
			query = null;
			tx = null;
		}
		return lista;
	}

	@SuppressWarnings("unchecked")
	public List<ParametroConfiguracion> listaPorCriteriaQuery(String criteria) {
		List<ParametroConfiguracion> lista = new ArrayList<ParametroConfiguracion>();
		Transaction tx = null;
		Query query = null;
		try {
			try {
				this.session = HibernateUtil.getInstance().getCurrentSession();
			} catch (HibernateException he) {
				session = HibernateUtil.getInstance().openSession();
			}
			tx = this.session.beginTransaction();
			query = session.createQuery(criteria);
			lista = query.list();
			tx.commit();
		} catch (Exception e) {
			if ( tx != null )
				tx.rollback();
			log.error(e.getMessage());
		} finally {
			query = null;
			tx = null;
		}
		return lista;
	}

}
