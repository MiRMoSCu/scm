package com.artiffex.scm.web.businesstier.service.interfaz;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.artiffex.scm.web.businesstier.utilidades.ComboSelect;

public interface GradoPretendeService {
	
	public List<ComboSelect> listaComboSelect();
	
	public BigDecimal precioPorGradoPorFecha(int idGradoPretende, Date fecha);

}
