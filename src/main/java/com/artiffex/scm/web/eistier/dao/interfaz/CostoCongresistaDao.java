package com.artiffex.scm.web.eistier.dao.interfaz;

import java.util.List;

import com.artiffex.scm.web.businesstier.entity.CostoCongresista;

public interface CostoCongresistaDao {
	
	public int crea(CostoCongresista costoCongresista);
	
	public CostoCongresista buscaPorCriteriaQuery(String criteria);
	
	public void modifica(CostoCongresista costoCongresista);
	
	public void elimina(CostoCongresista costoCongresista);
	
	public List<CostoCongresista> listaPorSQLQuery(String queryString);
	
	public List<CostoCongresista> listaPorCriteriaQuery(String criteria);
	
}
