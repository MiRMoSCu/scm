package com.artiffex.scm.web.businesstier.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_participacion")
public class TipoParticipacion implements Serializable {

	private static final long serialVersionUID = -5873106122527949760L;
	
	private Integer idTipoParticipacion;
	private String nombre;
	private String descripcion;
	private boolean activo;
	
	// constructor
	public TipoParticipacion() { }

	public TipoParticipacion(Integer idTipoParticipacion, String nombre,
			String descripcion, boolean activo) {
		super();
		this.idTipoParticipacion = idTipoParticipacion;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.activo = activo;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_tipo_participacion", unique=true, nullable=false)
	public Integer getIdTipoParticipacion() { return idTipoParticipacion; }
	public void setIdTipoParticipacion(Integer idTipoParticipacion) { this.idTipoParticipacion = idTipoParticipacion; }

	@Column(name="nombre", length=45)
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }

	@Column(name="descripcion", length=45)
	public String getDescripcion() { return descripcion; }
	public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

	@Column(name="activo")
	public boolean isActivo() { return activo; }
	public void setActivo(boolean activo) { this.activo = activo; }
	
}
