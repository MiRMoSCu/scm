package com.artiffex.scm.web.eistier.dao.interfaz;

import java.util.List;

import com.artiffex.scm.web.businesstier.entity.PerfilXUsuario;

public interface PerfilXUsuarioDao {
	
	public int crea(PerfilXUsuario perfilXUsuario);
	
	public PerfilXUsuario buscaPorCriteriaQuery(String criteria);
	
	public void modifica(PerfilXUsuario perfilXUsuario);
	
	public void elimina(PerfilXUsuario perfilXUsuario);
	
	public List<PerfilXUsuario> listaPorSQLQuery(String queryString);
	
	public List<PerfilXUsuario> listaPorCriteriaQuery(String criteria);

}
