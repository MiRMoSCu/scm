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

import com.artiffex.scm.web.businesstier.entity.TipoPonencia;
import com.artiffex.scm.web.eistier.dao.interfaz.TipoPonenciaDao;
import com.artiffex.scm.web.eistier.hibernate.HibernateUtil;

@Repository("tipoPonenciaDao")
public class TipoPonenciaDaoImpl implements TipoPonenciaDao {

	private static final Logger log = Logger.getLogger(TipoPonenciaDaoImpl.class);
	
	private Session session;

	public int crea(TipoPonencia tipoPonencia) {
		int id = 0;
		Transaction tx = null;
		try {
			try {
				this.session = HibernateUtil.getInstance().getCurrentSession();
			} catch (HibernateException he) {
				session = HibernateUtil.getInstance().openSession();
			}
			tx = this.session.beginTransaction();
			id = (Integer) this.session.save(tipoPonencia);
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

	public TipoPonencia buscaPorSQLQuery(String queryString) {
		TipoPonencia obj = null;
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
			obj = (TipoPonencia) query.uniqueResult();
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

	public TipoPonencia buscaPorCriteriaQuery(String criteria) {
		TipoPonencia obj = null;
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
			obj = (TipoPonencia) query.uniqueResult();
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

	public void modifica(TipoPonencia tipoPonencia) {
		Transaction tx = null;
		try {
			try {
				this.session = HibernateUtil.getInstance().getCurrentSession();
			} catch (HibernateException he) {
				session = HibernateUtil.getInstance().openSession();
			}
			tx = this.session.beginTransaction();
			session.update(tipoPonencia);
			tx.commit();
		} catch (Exception e) {
			if ( tx != null )
				tx.rollback();
			log.error(e.getMessage());
		} finally {
			tx = null;
		}
	}

	public void elimina(TipoPonencia tipoPonencia) {
		Transaction tx = null;
		try {
			try {
				this.session = HibernateUtil.getInstance().getCurrentSession();
			} catch (HibernateException he) {
				session = HibernateUtil.getInstance().openSession();
			}
			tx = this.session.beginTransaction();
			session.delete(tipoPonencia);
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
	public List<TipoPonencia> listaPorSQLQuery(String queryString) {
		List<TipoPonencia> lista = new ArrayList<TipoPonencia>();
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
	public List<TipoPonencia> ListaPorCriteriaQuery(String criteria) {
		List<TipoPonencia> lista = new ArrayList<TipoPonencia>();
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
