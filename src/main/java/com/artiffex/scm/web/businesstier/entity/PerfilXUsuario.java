package com.artiffex.scm.web.businesstier.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="perfil_x_usuario")
public class PerfilXUsuario implements Serializable {

	private static final long serialVersionUID = 5868891553686455735L;
	
	private Integer idPerfilXUsuario;
	private Usuario usuario;
	private Perfil perfil;
	private boolean activo;
	
	// constructor
	public PerfilXUsuario() { }

	public PerfilXUsuario(Integer idPerfilXUsuario, Usuario usuario,
			Perfil perfil, boolean activo) {
		super();
		this.idPerfilXUsuario = idPerfilXUsuario;
		this.usuario = usuario;
		this.perfil = perfil;
		this.activo = activo;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_perfil_x_usuario", unique=true, nullable=false)
	public Integer getIdPerfilXUsuario() { return idPerfilXUsuario; }
	public void setIdPerfilXUsuario(Integer idPerfilXUsuario) { this.idPerfilXUsuario = idPerfilXUsuario; }

	@OneToOne
	@JoinColumn(name="id_usuario")
	public Usuario getUsuario() { return usuario; }
	public void setUsuario(Usuario usuario) { this.usuario = usuario; }

	@OneToOne
	@JoinColumn(name="id_perfil")
	public Perfil getPerfil() { return perfil; }
	public void setPerfil(Perfil perfil) { this.perfil = perfil; }

	@Column(name="activo")
	public boolean isActivo() { return activo; }
	public void setActivo(boolean activo) { this.activo = activo; }
	
}
