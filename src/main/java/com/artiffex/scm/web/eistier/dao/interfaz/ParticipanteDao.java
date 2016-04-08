package com.artiffex.scm.web.eistier.dao.interfaz;

import java.util.List;

import com.artiffex.scm.web.businesstier.entity.Participante;

public interface ParticipanteDao {
	
	public int crea(Participante participante);
	
	public Participante buscaPorCriteriaQuery(String criteria);
	
	public void modifica(Participante participante);
	
	public void elimina(Participante participante); // ES MEJOR UTILIZAR BORRADO LOGICO
	
	public List<Participante> listaPorSQLQuery(String queryString);
	
	public List<Participante> listaPorCriteriaQuery(String criteria);
	
	public Object buscaValorPorSQLQuery(String queryString);

}
