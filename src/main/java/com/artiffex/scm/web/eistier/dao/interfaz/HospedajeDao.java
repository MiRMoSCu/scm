package com.artiffex.scm.web.eistier.dao.interfaz;

import java.util.List;

import com.artiffex.scm.web.businesstier.entity.Hospedaje;

public interface HospedajeDao {
	
	public int crea(Hospedaje hospedaje);
	
	public Hospedaje buscaPorSQLQuery(String queryString);
	
	public Hospedaje buscaPorCriteriaQuery(String criteria);
	
	public void modifica(Hospedaje hospedaje);
	
	public void elimina(Hospedaje hospedaje);
	
	public List<Hospedaje> listaPorSQLQuery(String queryString);
	
	public List<Hospedaje> ListaPorCriteriaQuery(String criteria);

}
