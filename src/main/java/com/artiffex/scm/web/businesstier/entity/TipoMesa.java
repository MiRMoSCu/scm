package com.artiffex.scm.web.businesstier.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_mesa")
public class TipoMesa implements Serializable {

	private static final long serialVersionUID = 641456407307665878L;
	
	private Integer idTipoMesa;
	private String nombre;
	private String descripcion;
	private Boolean activo;
	
	// constructor
	public TipoMesa() { }
	
	public TipoMesa(Integer idTipoMesa) {
		super();
		this.idTipoMesa = idTipoMesa;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_tipo_mesa", unique=true, nullable=false)
	public Integer getIdTipoMesa() { return idTipoMesa; }
	public void setIdTipoMesa(Integer idTipoMesa) { this.idTipoMesa = idTipoMesa; }

	@Column(name="nombre", length=120)
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }

	@Column(name="descripcion", length=250)
	public String getDescripcion() { return descripcion; }
	public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

	@Column(name="activo")
	public Boolean getActivo() { return activo; }
	public void setActivo(Boolean activo) { this.activo = activo; }
	
}
