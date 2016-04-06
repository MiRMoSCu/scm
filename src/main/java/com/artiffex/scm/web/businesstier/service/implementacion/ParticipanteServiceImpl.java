package com.artiffex.scm.web.businesstier.service.implementacion;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.artiffex.scm.web.businesstier.entity.Participante;
import com.artiffex.scm.web.businesstier.service.interfaz.ParticipanteService;
import com.artiffex.scm.web.eistier.dao.interfaz.ParticipanteDao;

@Service("participanteService")
public class ParticipanteServiceImpl implements ParticipanteService {
	
	@Resource
	private ParticipanteDao participanteDao;
	
	// getters and setters para standaloneApplicationContext.xml

	public ParticipanteDao getParticipanteDao() { return participanteDao; }
	public void setParticipanteDao(ParticipanteDao participanteDao) { this.participanteDao = participanteDao; }

	// metodos implementados

	 @Transactional 
	public int creaParticipante(Participante participante) {
		return participanteDao.crea(participante);
	}

}
