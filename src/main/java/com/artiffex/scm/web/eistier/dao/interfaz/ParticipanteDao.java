package com.artiffex.scm.web.eistier.dao.interfaz;

import java.util.List;

import com.artiffex.scm.web.businesstier.entity.Participante;

public interface ParticipanteDao {
	
	public int crea(Participante participante);
	
	public Participante busca(int idParticipante);
	
	public Participante buscaPorQuery(String query);
	
	public void modifica(Participante participante);
	
	public void elimina(int idParticipante);
	
	public List<Participante> lista();

}
