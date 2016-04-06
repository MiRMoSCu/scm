package com.artiffex.scm.web.businesstier.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hotel")
public class Hotel implements Serializable {

	private static final long serialVersionUID = -56486230125123935L;
	
	private Integer idHotel;
	private String nombre;
	private Boolean activo;
	
	// constructor
	public Hotel() { }

	public Hotel(Integer idHotel, String nombre, Boolean activo) {
		super();
		this.idHotel = idHotel;
		this.nombre = nombre;
		this.activo = activo;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_hotel", unique=true, nullable=false)
	public Integer getIdHotel() { return idHotel; }
	public void setIdHotel(Integer idHotel) { this.idHotel = idHotel; }

	@Column(name="nombre", length=200)
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }

	@Column(name="activo")
	public Boolean isActivo() { return activo; }
	public void setActivo(Boolean activo) { this.activo = activo; }
	
}
