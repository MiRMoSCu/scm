package com.artiffex.scm.web.eistier.dao.interfaz;

import java.util.List;

import com.artiffex.scm.web.businesstier.entity.ColacionGrado;

public interface ColacionGradoDao {
	
	public int crea(ColacionGrado colacionGrado);
	
	public ColacionGrado buscaPorCriteriaQuery(String criteria);
	
	public void modifica(ColacionGrado colacionGrado);
	
	public void elimina(ColacionGrado colacionGrado);
	
	public List<ColacionGrado> listaPorSQLQuery(String queryString);
	
	public List<ColacionGrado> listaPorCriteriaQuery(String criteria);

}
