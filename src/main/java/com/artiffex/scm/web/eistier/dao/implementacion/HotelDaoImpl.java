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

import com.artiffex.scm.web.businesstier.entity.Hotel;
import com.artiffex.scm.web.eistier.dao.interfaz.HotelDao;
import com.artiffex.scm.web.eistier.hibernate.HibernateUtil;

@Repository("hotelDao")
public class HotelDaoImpl implements HotelDao {

	private static final Logger log = Logger.getLogger(HotelDaoImpl.class);
	
	private Session session;

	public int crea(Hotel hotel) {
		int id = 0;
		Transaction tx = null;
		try {
			try {
				this.session = HibernateUtil.getInstance().getCurrentSession();
			} catch (HibernateException he) {
				session = HibernateUtil.getInstance().openSession();
			}
			tx = this.session.beginTransaction();
			id = (Integer) this.session.save(hotel);
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

	public Hotel buscaPorSQLQuery(String queryString) {
		Hotel obj = null;
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
			obj = (Hotel) query.uniqueResult();
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

	public Hotel buscaPorCriteriaQuery(String criteria) {
		Hotel obj = null;
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
			obj = (Hotel) query.uniqueResult();
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

	public void modifica(Hotel hotel) {
		Transaction tx = null;
		try {
			try {
				this.session = HibernateUtil.getInstance().getCurrentSession();
			} catch (HibernateException he) {
				session = HibernateUtil.getInstance().openSession();
			}
			tx = this.session.beginTransaction();
			session.update(hotel);
			tx.commit();
		} catch (Exception e) {
			if ( tx != null )
				tx.rollback();
			log.error(e.getMessage());
		} finally {
			tx = null;
		}
	}

	public void elimina(Hotel hotel) {
		Transaction tx = null;
		try {
			try {
				this.session = HibernateUtil.getInstance().getCurrentSession();
			} catch (HibernateException he) {
				session = HibernateUtil.getInstance().openSession();
			}
			tx = this.session.beginTransaction();
			session.delete(hotel);
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
	public List<Hotel> listaPorSQLQuery(String queryString) {
		List<Hotel> lista = new ArrayList<Hotel>();
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
	public List<Hotel> ListaPorCriteriaQuery(String criteria) {
		List<Hotel> lista = new ArrayList<Hotel>();
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
