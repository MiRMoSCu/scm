package com.artiffex.scm.web.eistier.dao.interfaz;

import java.util.List;

import com.artiffex.scm.web.businesstier.entity.Registro;

public interface RegistroDao {
	
	public int crea(Registro registro);
	
	public Registro buscaPorCriteriaQuery(String criteria);
	
	public void modifica(Registro registro);
	
	public void elimina(Registro registro);
	
	public List<Registro> listaPorSQLQuery(String queryString);
	
	public List<Registro> ListaPorCriteriaQuery(String criteria);

}
