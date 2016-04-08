package com.artiffex.scm.web.eistier.dao.interfaz;

import java.util.List;

import com.artiffex.scm.web.businesstier.entity.ParametroConfiguracion;

public interface ParametroConfiguracionDao {
	
	public int crea(ParametroConfiguracion parametroConfiguracion);
	
	public ParametroConfiguracion buscaPorCriteriaQuery(String criteria);
	
	public void modifica(ParametroConfiguracion parametroConfiguracion);
	
	public void elimina(ParametroConfiguracion parametroConfiguracion);
	
	public List<ParametroConfiguracion> listaPorSQLQuery(String queryString);
	
	public List<ParametroConfiguracion> ListaPorCriteriaQuery(String criteria);
	
}
