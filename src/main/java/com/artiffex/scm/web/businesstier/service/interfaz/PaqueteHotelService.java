package com.artiffex.scm.web.businesstier.service.interfaz;

import java.math.BigDecimal;
import java.util.List;

import com.artiffex.scm.web.businesstier.utilidades.ComboSelect;

public interface PaqueteHotelService {
	
	public List<ComboSelect> listaComboSelect();
	
	public BigDecimal precioPorPaquete(int idPaqueteHotel);

}
