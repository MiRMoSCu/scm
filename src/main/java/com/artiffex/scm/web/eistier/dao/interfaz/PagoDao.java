package com.artiffex.scm.web.eistier.dao.interfaz;

import java.util.List;

import com.artiffex.scm.web.businesstier.entity.Pago;

public interface PagoDao {
	
	public int crea(Pago pago);
	
	public Pago buscaPorSQLQuery(String queryString);
	
	public Pago buscaPorCriteriaQuery(String criteria);
	
	public void modifica(Pago pago);
	
	public void elimina(Pago pago);
	
	public List<Pago> listaPorSQLQuery(String queryString);
	
	public List<Pago> ListaPorCriteriaQuery(String criteria);

}
