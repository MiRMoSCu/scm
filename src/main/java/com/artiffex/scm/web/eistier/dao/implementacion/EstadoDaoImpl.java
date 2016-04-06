package com.artiffex.scm.web.eistier.dao.implementacion;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.artiffex.scm.web.businesstier.entity.Estado;
import com.artiffex.scm.web.eistier.dao.interfaz.EstadoDao;
import com.artiffex.scm.web.eistier.hibernate.HibernateUtil;

@Repository("estadoDao")
public class EstadoDaoImpl implements EstadoDao {
	
	private static final Logger log = Logger.getLogger(EstadoDaoImpl.class);
	
	private Session session;

	@SuppressWarnings("unchecked")
	public List<Estado> lista() {
		List<Estado> lista = new ArrayList<Estado>();
		Transaction tx = null;
		try {
			try {
				this.session = HibernateUtil.getInstance().getCurrentSession();
			} catch (HibernateException he) {
				this.session = HibernateUtil.getInstance().openSession();
			}
			tx = this.session.beginTransaction();
			lista = session.createQuery("from Estado e where e.activo = true order by e.idEstado asc").list();
			session.getTransaction().commit();
		} catch (Exception e) {
			if (tx != null)
				session.getTransaction().rollback();
			log.error(e.getMessage());
		}
		return lista;
	}
	
	

}
