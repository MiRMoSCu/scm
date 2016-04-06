package com.artiffex.scm.web.businesstier.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estado")
public class Estado implements Serializable {

	private static final long serialVersionUID = 2992218235154680533L;
	
	private Integer idEstado;
	private String nombre;
	private boolean activo;
	
	public Estado() { }
	
	public Estado(Integer idEstado, String nombre, boolean activo) {
		super();
		this.idEstado = idEstado;
		this.nombre = nombre;
		this.activo = activo;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_estado", unique=true, nullable=false)
	public Integer getIdEstado() { return idEstado; }
	public void setIdEstado(Integer idEstado) { this.idEstado = idEstado; }

	@Column(name="nombre", length=60)
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }

	@Column(name="activo")
	public boolean isActivo() { return activo; }
	public void setActivo(boolean activo) { this.activo = activo; }
	
}
