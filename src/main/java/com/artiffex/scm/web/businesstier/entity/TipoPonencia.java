package com.artiffex.scm.web.businesstier.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_ponencia")
public class TipoPonencia implements Serializable {

	private static final long serialVersionUID = -2365363479742926276L;
	
	private Integer idTipoPonencia;
	private String nombre;
	private String descripcion;
	private Boolean activo;
	
	// constructor
	public TipoPonencia() { }
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_tipo_ponencia", unique=true, nullable=false)
	public Integer getIdTipoPonencia() { return idTipoPonencia; }
	public void setIdTipoPonencia(Integer idTipoPonencia) { this.idTipoPonencia = idTipoPonencia; }

	@Column(name="nombre", length=45)
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }

	@Column(name="descripcion", length=45)
	public String getDescripcion() { return descripcion; }
	public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

	@Column(name="activo")
	public Boolean isActivo() { return activo; }
	public void setActivo(Boolean activo) { this.activo = activo; }

}
