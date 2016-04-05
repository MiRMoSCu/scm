package com.artiffex.scm.web.businesstier.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="perfil_x_usuario")
public class PerfilXUsuario implements Serializable {

	private static final long serialVersionUID = 5868891553686455735L;
	
	private Integer idPerfilXUsuario;
	private Usuario usuario;
	private Perfil perfil;
	private Boolean activo;
	
	// constructor
	public PerfilXUsuario() { }

	public PerfilXUsuario(Integer idPerfilXUsuario, Usuario usuario,
			Perfil perfil, Boolean activo) {
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
	@PrimaryKeyJoinColumn
	public Usuario getUsuario() { return usuario; }
	public void setUsuario(Usuario usuario) { this.usuario = usuario; }

	@OneToOne
	@PrimaryKeyJoinColumn
	public Perfil getPerfil() { return perfil; }
	public void setPerfil(Perfil perfil) { this.perfil = perfil; }

	@Column(name="activo")
	public Boolean isActivo() { return activo; }
	public void setActivo(Boolean activo) { this.activo = activo; }
	
}
