package com.artiffex.scm.web.businesstier.service.interfaz;

import com.artiffex.scm.web.businesstier.entity.Participante;

public interface ParticipanteService {
	
	public int creaParticipante(Participante participante);
	
	public Participante buscaParticipante(int idParticipante);
	
	public byte[] obtieneDocumentoListaParticipante();

}
