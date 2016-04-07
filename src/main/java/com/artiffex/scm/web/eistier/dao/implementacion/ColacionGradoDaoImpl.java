package com.artiffex.scm.web.eistier.dao.implementacion;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.artiffex.scm.web.businesstier.entity.ColacionGrado;
import com.artiffex.scm.web.eistier.dao.interfaz.ColacionGradoDao;
import com.artiffex.scm.web.eistier.hibernate.HibernateUtil;

@Repository("colacionGradoDao")
public class ColacionGradoDaoImpl implements ColacionGradoDao {
	
	private static final Logger log = Logger.getLogger(ColacionGradoDaoImpl.class);
	
	private Session session;

	public int crea(ColacionGrado colacionGrado) {
		int id = 0;
		Transaction tx = null;
		try {
			try {
				this.session = HibernateUtil.getInstance().getCurrentSession();
			} catch (HibernateException he) {
				this.session = HibernateUtil.getInstance().openSession();
			}
			tx = this.session.beginTransaction();
			id = (Integer) this.session.save(colacionGrado);
			tx.commit();
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			log.error(e.getMessage());
		} finally {
			tx = null;
		}
		return id;
	}

}
