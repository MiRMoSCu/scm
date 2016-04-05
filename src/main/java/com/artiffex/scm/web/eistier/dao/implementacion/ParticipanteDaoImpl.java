package com.artiffex.scm.web.eistier.dao.implementacion;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.artiffex.scm.web.businesstier.entity.Participante;
import com.artiffex.scm.web.eistier.dao.interfaz.ParticipanteDao;
import com.artiffex.scm.web.eistier.hibernate.HibernateUtil;

@Repository("participanteDao")
public class ParticipanteDaoImpl implements ParticipanteDao {
	
	private static final Logger log = Logger.getLogger(ParticipanteDaoImpl.class);
	
	private Session session;

	public int crea(Participante participante) {
		int id = 0;
		try {
			try {
				session = HibernateUtil.getInstance().getCurrentSession();
			} catch (HibernateException he) {
				session = HibernateUtil.getInstance().openSession();
			}
			session.beginTransaction();
			id = (Integer) session.save(participante);
			session.getTransaction().commit();
		} catch (Exception e) {
			log.error(e.getMessage());
			session.getTransaction().rollback();
		}
		return id;
	}

	public Participante busca(int idParticipante) {
		// TODO Auto-generated method stub
		return null;
	}

	public Participante buscaPorQuery(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	public void modifica(Participante participante) {
		// TODO Auto-generated method stub
		
	}

	public void elimina(int idParticipante) {
		// TODO Auto-generated method stub
		
	}

	public List<Participante> lista() {
		// TODO Auto-generated method stub
		return null;
	}

}
