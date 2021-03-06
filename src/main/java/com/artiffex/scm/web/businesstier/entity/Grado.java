package com.artiffex.scm.web.businesstier.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="grado")
public class Grado implements Serializable {

	private static final long serialVersionUID = 2330949541524310859L;
	
	private Integer idGrado;
	private String nombre;
	private String descripcion;
	private Boolean activo;
	
	// constructor
	public Grado() { }
	
	public Grado(Integer idGrado) {
		super();
		this.idGrado = idGrado;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_grado", unique=true, nullable=false)
	public Integer getIdGrado() { return idGrado; }
	public void setIdGrado(Integer idGrado) { this.idGrado = idGrado; }

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
