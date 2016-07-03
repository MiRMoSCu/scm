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

import com.artiffex.scm.web.businesstier.entity.TipoParticipacion;
import com.artiffex.scm.web.eistier.dao.interfaz.TipoParticipacionDao;

@Repository("tipoParticipacionDao")
public class TipoParticipacionDaoImpl implements TipoParticipacionDao {

	private static final Logger log = Logger.getLogger(TipoParticipacionDaoImpl.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory( SessionFactory sessionFactory ) {
		this.sessionFactory = sessionFactory;
	}

	public int crea(TipoParticipacion tipoParticipacion) {
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
			id = (Integer) session.save(tipoParticipacion);
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

	public TipoParticipacion buscaPorCriteriaQuery(String criteria) {
		TipoParticipacion obj = null;
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
			obj = (TipoParticipacion) query.uniqueResult();
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

	public void modifica(TipoParticipacion tipoParticipacion) {
		Session session = null;
		Transaction tx = null;
		try {
			try {
				session = this.sessionFactory.getCurrentSession();
			} catch ( HibernateException he ) {
				session = this.sessionFactory.openSession();
			}
			tx = session.beginTransaction();
			session.update(tipoParticipacion);
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

	public void elimina(TipoParticipacion tipoParticipacion) {
		Session session = null;
		Transaction tx = null;
		try {
			try {
				session = this.sessionFactory.getCurrentSession();
			} catch ( HibernateException he ) {
				session = this.sessionFactory.openSession();
			}
			tx = session.beginTransaction();
			session.delete(tipoParticipacion);
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
	public List<TipoParticipacion> listaPorSQLQuery(String queryString) {
		List<TipoParticipacion> lista = new ArrayList<TipoParticipacion>();
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
	public List<TipoParticipacion> listaPorCriteriaQuery(String criteria) {
		List<TipoParticipacion> lista = new ArrayList<TipoParticipacion>();
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
