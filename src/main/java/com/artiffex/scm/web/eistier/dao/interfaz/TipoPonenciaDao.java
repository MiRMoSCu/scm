package com.artiffex.scm.web.eistier.dao.interfaz;

import java.util.List;

import com.artiffex.scm.web.businesstier.entity.TipoPonencia;

public interface TipoPonenciaDao {
	
	public int crea(TipoPonencia tipoPonencia);
	
	public TipoPonencia buscaPorCriteriaQuery(String criteria);
	
	public void modifica(TipoPonencia tipoPonencia);
	
	public void elimina(TipoPonencia tipoPonencia);
	
	public List<TipoPonencia> listaPorSQLQuery(String queryString);
	
	public List<TipoPonencia> ListaPorCriteriaQuery(String criteria);

}
