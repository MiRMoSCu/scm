package com.artiffex.scm.web.eistier.dao.interfaz;

import java.util.List;

import com.artiffex.scm.web.businesstier.entity.GradoPretendePrecio;

public interface GradoPretendePrecioDao {
	
	public int crea(GradoPretendePrecio gradoPretendePrecio);
	
	public GradoPretendePrecio buscaPorCriteriaQuery(String criteria);
	
	public void modifica(GradoPretendePrecio gradoPretendePrecio);
	
	public void elimina(GradoPretendePrecio gradoPretendePrecio);
	
	public List<GradoPretendePrecio> listaPorSQLQuery(String queryString);
	
	public List<GradoPretendePrecio> listaPorCriteriaQuery(String criteria);

}
