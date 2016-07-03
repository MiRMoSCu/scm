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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.artiffex.scm.web.businesstier.entity.TipoPonencia;
import com.artiffex.scm.web.eistier.dao.interfaz.TipoPonenciaDao;

@Repository("tipoPonenciaDao")
public class TipoPonenciaDaoImpl implements TipoPonenciaDao {

	private static final Logger log = Logger.getLogger(TipoPonenciaDaoImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;

	public int crea(TipoPonencia tipoPonencia) {
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
			id = (Integer) session.save(tipoPonencia);
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

	public TipoPonencia buscaPorCriteriaQuery(String criteria) {
		TipoPonencia obj = null;
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
			obj = (TipoPonencia) query.uniqueResult();
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

	public void modifica(TipoPonencia tipoPonencia) {
		Session session = null;
		Transaction tx = null;
		try {
			try {
				session = this.sessionFactory.getCurrentSession();
			} catch ( HibernateException he ) {
				session = this.sessionFactory.openSession();
			}
			tx = session.beginTransaction();
			session.update(tipoPonencia);
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

	public void elimina(TipoPonencia tipoPonencia) {
		Session session = null;
		Transaction tx = null;
		try {
			try {
				session = this.sessionFactory.getCurrentSession();
			} catch ( HibernateException he ) {
				session = this.sessionFactory.openSession();
			}
			tx = session.beginTransaction();
			session.delete(tipoPonencia);
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
	public List<TipoPonencia> listaPorSQLQuery(String queryString) {
		List<TipoPonencia> lista = new ArrayList<TipoPonencia>();
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
	public List<TipoPonencia> listaPorCriteriaQuery(String criteria) {
		List<TipoPonencia> lista = new ArrayList<TipoPonencia>();
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
