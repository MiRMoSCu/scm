package com.artiffex.scm.web.eistier.dao.interfaz;

import java.util.List;

import com.artiffex.scm.web.businesstier.entity.TipoParticipacion;

public interface TipoParticipacionDao {
	
	public int crea(TipoParticipacion tipoParticipacion);
	
	public TipoParticipacion buscaPorSQLQuery(String queryString);
	
	public TipoParticipacion buscaPorCriteriaQuery(String criteria);
	
	public void modifica(TipoParticipacion tipoParticipacion);
	
	public void elimina(TipoParticipacion tipoParticipacion);
	
	public List<TipoParticipacion> listaPorSQLQuery(String queryString);
	
	public List<TipoParticipacion> ListaPorCriteriaQuery(String criteria);

}
