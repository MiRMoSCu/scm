package com.artiffex.scm.web.eistier.dao.interfaz;

import java.util.List;

import com.artiffex.scm.web.businesstier.entity.Estado;

public interface EstadoDao {
	
	public int crea(Estado estado);
	
	public Estado buscaPorCriteriaQuery(String criteria);
	
	public void modifica(Estado estado);
	
	public void elimina(Estado estado);
	
	public List<Estado> listaPorSQLQuery(String queryString);
	
	public List<Estado> listaPorCriteriaQuery(String criteria);

}
