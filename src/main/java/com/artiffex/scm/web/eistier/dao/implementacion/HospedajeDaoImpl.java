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

import com.artiffex.scm.web.businesstier.entity.Hospedaje;
import com.artiffex.scm.web.eistier.dao.interfaz.HospedajeDao;

@Repository("hospedajeDao")
public class HospedajeDaoImpl implements HospedajeDao {

	private static final Logger log = Logger.getLogger(HospedajeDaoImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public int crea(Hospedaje hospedaje) {
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
			id = (Integer) session.save(hospedaje);
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

	public Hospedaje buscaPorCriteriaQuery(String criteria) {
		Hospedaje obj = null;
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
			obj = (Hospedaje) query.uniqueResult();
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

	public void modifica(Hospedaje hospedaje) {
		Session session = null;
		Transaction tx = null;
		try {
			try {
				session = this.sessionFactory.getCurrentSession();
			} catch ( HibernateException he ) {
				session = this.sessionFactory.openSession();
			}
			tx = session.beginTransaction();
			session.update(hospedaje);
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

	public void elimina(Hospedaje hospedaje) {
		Session session = null;
		Transaction tx = null;
		try {
			try {
				session = this.sessionFactory.getCurrentSession();
			} catch ( HibernateException he ) {
				session = this.sessionFactory.openSession();
			}
			tx = session.beginTransaction();
			session.delete(hospedaje);
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
	public List<Hospedaje> listaPorSQLQuery(String queryString) {
		List<Hospedaje> lista = new ArrayList<Hospedaje>();
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
	public List<Hospedaje> listaPorCriteriaQuery(String criteria) {
		List<Hospedaje> lista = new ArrayList<Hospedaje>();
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
