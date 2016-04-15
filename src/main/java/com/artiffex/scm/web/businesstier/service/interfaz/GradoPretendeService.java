package com.artiffex.scm.web.businesstier.service.interfaz;

import java.util.List;

import com.artiffex.scm.web.businesstier.utilidades.ComboSelect;

public interface GradoPretendeService {
	
	public List<ComboSelect> listaComboSelect();
	
	public float precioPorGrado(int idGradoPretende);

}