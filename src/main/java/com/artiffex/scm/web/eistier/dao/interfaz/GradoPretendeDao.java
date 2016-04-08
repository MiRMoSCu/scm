package com.artiffex.scm.web.eistier.dao.interfaz;

import java.util.List;

import com.artiffex.scm.web.businesstier.entity.GradoPretende;

public interface GradoPretendeDao {
	
	public int crea(GradoPretende gradoPretende);
	
	public GradoPretende buscaPorCriteriaQuery(String criteria);
	
	public void modifica(GradoPretende gradoPretende);
	
	public void elimina(GradoPretende gradoPretende);
	
	public List<GradoPretende> listaPorSQLQuery(String queryString);
	
	public List<GradoPretende> ListaPorCriteriaQuery(String criteria);

}
