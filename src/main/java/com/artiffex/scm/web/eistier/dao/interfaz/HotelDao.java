package com.artiffex.scm.web.eistier.dao.interfaz;

import java.util.List;

import com.artiffex.scm.web.businesstier.entity.Hotel;

public interface HotelDao {
	
	public int crea(Hotel hotel);
	
	public Hotel buscaPorCriteriaQuery(String criteria);
	
	public void modifica(Hotel hotel);
	
	public void elimina(Hotel hotel);
	
	public List<Hotel> listaPorSQLQuery(String queryString);
	
	public List<Hotel> listaPorCriteriaQuery(String criteria);

}
