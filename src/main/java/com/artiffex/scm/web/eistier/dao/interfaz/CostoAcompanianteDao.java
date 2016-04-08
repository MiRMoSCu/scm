package com.artiffex.scm.web.eistier.dao.interfaz;

import java.util.List;

import com.artiffex.scm.web.businesstier.entity.CostoAcompaniante;

public interface CostoAcompanianteDao {
	
	public int crea(CostoAcompaniante costoAcompaniante);
	
	public CostoAcompaniante buscaPorCriteriaQuery(String criteria);
	
	public void modifica(CostoAcompaniante costoAcompaniante);
	
	public void elimina(CostoAcompaniante costoAcompaniante);
	
	public List<CostoAcompaniante> listaPorSQLQuery(String queryString);
	
	public List<CostoAcompaniante> ListaPorCriteriaQuery(String criteria);

}
