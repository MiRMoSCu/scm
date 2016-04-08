package com.artiffex.scm.web.businesstier.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="grado_pretende")
public class GradoPretende implements Serializable {

	private static final long serialVersionUID = -4575129071458636924L;
	
	private Integer idGradoPretende;
	private String nombre;
	private String descripcion;
	private Float precio;
	private Boolean activo;
	
	// constructor
	public GradoPretende() { }

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_grado_pretende", unique=true, nullable=false)
	public Integer getIdGradoPretende() { return idGradoPretende; }
	public void setIdGradoPretende(Integer idGradoPretende) { this.idGradoPretende = idGradoPretende; }

	@Column(name="nombre", length=45)
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }

	@Column(name="descripcion", length=80)
	public String getDescripcion() { return descripcion; }
	public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

	@Column(name="precio", precision=2)
	public Float getPrecio() { return precio; }
	public void setPrecio(Float precio) { this.precio = precio; }

	@Column(name="activo")
	public Boolean getActivo() { return activo; }
	public void setActivo(Boolean activo) { this.activo = activo; }
	
}
 