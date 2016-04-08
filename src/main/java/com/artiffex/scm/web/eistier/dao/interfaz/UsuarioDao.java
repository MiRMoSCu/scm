package com.artiffex.scm.web.eistier.dao.interfaz;

import java.util.List;

import com.artiffex.scm.web.businesstier.entity.Usuario;

public interface UsuarioDao {
	
	public int crea(Usuario usuario);
	
	public Usuario buscaPorCriteriaQuery(String criteria);
	
	public void modifica(Usuario usuario);
	
	public void elimina(Usuario usuario);
	
	public List<Usuario> listaPorSQLQuery(String queryString);
	
	public List<Usuario> ListaPorCriteriaQuery(String criteria);

}
