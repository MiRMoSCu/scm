package com.artiffex.scm.web.eistier.dao.interfaz;

import java.util.List;

import com.artiffex.scm.web.businesstier.entity.Acompaniante;

public interface AcompanianteDao {

	public int crea(Acompaniante acompaniante);
	
	public Acompaniante buscaPorSQLQuery(String queryString);
	
	public Acompaniante buscaPorCriteriaQuery(String criteria);
	
	public void modifica(Acompaniante acompaniante);
	
	public void elimina(Acompaniante acompaniante);
	
	public List<Acompaniante> listaPorSQLQuery(String queryString);
	
	public List<Acompaniante> listaPorCriteriaQuery(String criteria);
	
}
