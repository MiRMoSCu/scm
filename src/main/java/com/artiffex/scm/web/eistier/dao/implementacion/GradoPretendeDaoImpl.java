package com.artiffex.scm.web.eistier.dao.implementacion;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.artiffex.scm.web.businesstier.entity.GradoPretende;
import com.artiffex.scm.web.eistier.dao.interfaz.GradoPretendeDao;

@Repository("gradoPretendeDao")
public class GradoPretendeDaoImpl implements GradoPretendeDao {

	private static final Logger log = Logger.getLogger(GradoPretendeDaoImpl.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory( SessionFactory sessionFactory ) {
		this.sessionFactory = sessionFactory;
	}

	public int crea(GradoPretende gradoPretende) {
		int id = 0;
		Session session = null;
		Transaction tx = null;
		try {
			try {
				session = this.sessionFactory.getCurrentSession();
			} catch ( HibernateException he ) {
				session = this.sessionFactory.openSession();
			}
			tx = session.beginTransaction();
			id = (Integer) session.save(gradoPretende);
			tx.commit();
		} catch (Exception e) {
			if ( tx != null )
				tx.rollback();
			log.error(e.getMessage());
		} finally {
			tx = null;
			session = null;
		}
		return id;
	}

	public GradoPretende buscaPorCriteriaQuery(String criteria) {
		GradoPretende obj = null;
		Session session = null;
		Transaction tx = null;
		Query query = null;
		try {
			try {
				session = this.sessionFactory.getCurrentSession();
			} catch ( HibernateException he ) {
				session = this.sessionFactory.openSession();
			}
			tx = session.beginTransaction();
			query = session.createQuery(criteria);
			obj = (GradoPretende) query.uniqueResult();
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

	public void modifica(GradoPretende gradoPretende) {
		Session session = null;
		Transaction tx = null;
		try {
			try {
				session = this.sessionFactory.getCurrentSession();
			} catch ( HibernateException he ) {
				session = this.sessionFactory.openSession();
			}
			tx = session.beginTransaction();
			session.update(gradoPretende);
			tx.commit();
		} catch (Exception e) {
			if ( tx != null )
				tx.rollback();
			log.error(e.getMessage());
		} finally {
			tx = null;
			session = null;
		}
	}

	public void elimina(GradoPretende gradoPretende) {
		Session session = null;
		Transaction tx = null;
		try {
			try {
				session = this.sessionFactory.getCurrentSession();
			} catch ( HibernateException he ) {
				session = this.sessionFactory.openSession();
			}
			tx = session.beginTransaction();
			session.delete(gradoPretende);
			tx.commit();
		} catch (Exception e) {
			if ( tx != null )
				tx.rollback();
			log.error(e.getMessage());
		} finally {
			tx = null;
			session = null;
		}
	}

	@SuppressWarnings("unchecked")
	public List<GradoPretende> listaPorSQLQuery(String queryString) {
		List<GradoPretende> lista = new ArrayList<GradoPretende>();
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
			lista = query.list();
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
		return lista;
	}

	@SuppressWarnings("unchecked")
	public List<GradoPretende> listaPorCriteriaQuery(String criteria) {
		List<GradoPretende> lista = new ArrayList<GradoPretende>();
		Session session = null;
		Transaction tx = null;
		Query query = null;
		try {
			try {
				session = this.sessionFactory.getCurrentSession();
			} catch ( HibernateException he ) {
				session = this.sessionFactory.openSession();
			}
			tx = session.beginTransaction();
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
			session = null;
		}
		return lista;
	}

}
