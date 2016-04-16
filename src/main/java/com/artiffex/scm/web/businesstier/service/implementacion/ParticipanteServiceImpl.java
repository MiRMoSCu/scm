package com.artiffex.scm.web.businesstier.service.implementacion;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.artiffex.scm.web.businesstier.entity.Participante;
import com.artiffex.scm.web.businesstier.service.interfaz.ParticipanteService;
import com.artiffex.scm.web.eistier.dao.interfaz.ParticipanteDao;

@Service("participanteService")
public class ParticipanteServiceImpl implements ParticipanteService {
	
	/* NO BORRAR */
	// getters and setters para standaloneApplicationContext.xml
	//public ParticipanteDao getParticipanteDao() { return participanteDao; }
	//public void setParticipanteDao(ParticipanteDao participanteDao) { this.participanteDao = participanteDao; }

	
	private static final Logger log = Logger.getLogger(ParticipanteServiceImpl.class);
	
	@Resource
	private ParticipanteDao participanteDao;
	
	
	public int creaParticipante(Participante participante) {
		log.info("participanteService.creaParticipante");
		return participanteDao.crea(participante);
	}
	
	public Participante buscaParticipante(int idParticipante) {
		return participanteDao.buscaPorCriteriaQuery("from Participante p where p.idParticipante = " + idParticipante);
	}
	

}
