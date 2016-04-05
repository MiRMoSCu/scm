package com.artiffex.scm.web.businesstier.service.implementacion;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.artiffex.scm.web.businesstier.entity.Participante;
import com.artiffex.scm.web.businesstier.service.interfaz.ParticipanteService;
import com.artiffex.scm.web.eistier.dao.interfaz.ParticipanteDao;

@Service("participanteService")
public class ParticipanteServiceImpl implements ParticipanteService {
	
	@Resource
	private ParticipanteDao participanteDao;

	public int creaParticipante(Participante participante) {
		return participanteDao.crea(participante);
	}

}
