package com.artiffex.scm.web.eistier.dao.interfaz;

import java.util.List;

import com.artiffex.scm.web.businesstier.entity.Grado;

public interface GradoDao {
	
	public int crea(Grado grado);
	
	public Grado buscaPorCriteriaQuery(String criteria);
	
	public void modifica(Grado grado);
	
	public void elimina(Grado grado);
	
	public List<Grado> listaPorSQLQuery(String queryString);
	
	public List<Grado> ListaPorCriteriaQuery(String criteria);

}
