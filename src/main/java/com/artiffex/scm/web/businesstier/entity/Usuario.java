package com.artiffex.scm.web.businesstier.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 789662847586566059L;
	
	private Integer idUsuario;
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private String usuario;
	private String contrasenia;
	private boolean activo;
	//private Set<PerfilXUsuario> perfilXUsuario = new HashSet<PerfilXUsuario>();
	
	// constructor
	public Usuario() { }
	
	public Usuario(
			Integer idUsuario, String nombre, String apPaterno,
			String apMaterno, String usuario, String contrasenia, boolean activo) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.activo = activo;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_usuario", unique=true, nullable=false)
	public Integer getIdUsuario() { return idUsuario; }
	public void setIdUsuario(Integer idUsuario) { this.idUsuario = idUsuario; }

	@Column(name="nombre", length=80)
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	
	@Column(name="ap_paterno", length=45)
	public String getApPaterno() { return apPaterno; }
	public void setApPaterno(String apPaterno) { this.apPaterno = apPaterno; }

	@Column(name="ap_materno", length=45)
	public String getApMaterno() { return apMaterno; }
	public void setApMaterno(String apMaterno) { this.apMaterno = apMaterno; }

	@Column(name="usuario", length=45)
	public String getUsuario() { return usuario; }
	public void setUsuario(String usuario) { this.usuario = usuario; }

	@Column(name="contrasenia", length=45)
	public String getContrasenia() { return contrasenia; }
	public void setContrasenia(String contrasenia) { this.contrasenia = contrasenia; }

	@Column(name="activo")
	public boolean isActivo() { return activo; }
	public void setActivo(boolean activo) { this.activo = activo; }

}
