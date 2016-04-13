package com.artiffex.scm.web.eistier.dao.interfaz;

import java.util.List;

import com.artiffex.scm.web.businesstier.entity.Perfil;

public interface PerfilDao {
	
	public int crea(Perfil perfil);
	
	public Perfil buscaPorCriteriaQuery(String criteria);
	
	public void modifica(Perfil perfil);
	
	public void elimina(Perfil perfil);
	
	public List<Perfil> listaPorSQLQuery(String queryString);
	
	public List<Perfil> listaPorCriteriaQuery(String criteria);

}
