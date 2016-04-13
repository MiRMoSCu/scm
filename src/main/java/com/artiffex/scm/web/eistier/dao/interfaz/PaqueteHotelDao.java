package com.artiffex.scm.web.eistier.dao.interfaz;

import java.util.List;

import com.artiffex.scm.web.businesstier.entity.PaqueteHotel;

public interface PaqueteHotelDao {
	
	public int crea(PaqueteHotel paqueteHotel);
	
	public PaqueteHotel buscaPorCriteriaQuery(String criteria);
	
	public void modifica(PaqueteHotel paqueteHotel);
	
	public void elimina(PaqueteHotel paqueteHotel);
	
	public List<PaqueteHotel> listaPorSQLQuery(String queryString);
	
	public List<PaqueteHotel> listaPorCriteriaQuery(String criteria);

}
