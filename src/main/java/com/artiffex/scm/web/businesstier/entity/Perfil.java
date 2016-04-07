package com.artiffex.scm.web.businesstier.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="perfil")
public class Perfil implements Serializable {

	private static final long serialVersionUID = 5902223935623986924L;
	
	private Integer idPerfil;
	private String nombre;
	private String descripcion;
	private Boolean activo;
	
	// constructor
	public Perfil() { }
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_perfil", unique=true, nullable=false)
	public Integer getIdPerfil() { return idPerfil; }
	public void setIdPerfil(Integer idPerfil) { this.idPerfil = idPerfil; }
	
	@Column(name="nombre", length=45)
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	
	@Column(name="descripcion", length=80)
	public String getDescripcion() { return descripcion; }
	public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
	
	@Column(name="activo")
	public Boolean isActivo() { return activo; }
	public void setActivo(Boolean activo) { this.activo = activo; }
	
}
