package com.artiffex.scm.web.eistier.dao.interfaz;

import java.util.List;

import com.artiffex.scm.web.businesstier.entity.TipoMesa;

public interface TipoMesaDao {
	
	public int crea(TipoMesa tipoMesa);
	
	public TipoMesa buscaPorCriteriaQuery(String criteria);
	
	public void modifica(TipoMesa tipoMesa);
	
	public void elimina(TipoMesa tipoMesa);
	
	public List<TipoMesa> listaPorSQLQuery(String queryString);
	
	public List<TipoMesa> listaPorCriteriaQuery(String criteria);

}
