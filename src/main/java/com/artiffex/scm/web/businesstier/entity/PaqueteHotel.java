package com.artiffex.scm.web.businesstier.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="paquete_hotel")
public class PaqueteHotel implements Serializable {

	private static final long serialVersionUID = -8052428539706598409L;
	
	private Integer idPaqueteHotel;
	private Hotel hotel;
	private String nombre;
	private String descripcion;
	private Float precio;
	private Boolean activo;
	
	// constructor
	public PaqueteHotel() { }
	
	public PaqueteHotel(Integer idPaqueteHotel) {
		super();
		this.idPaqueteHotel = idPaqueteHotel;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_paquete_hotel", unique=true, nullable=false)
	public Integer getIdPaqueteHotel() { return idPaqueteHotel; }
	public void setIdPaqueteHotel(Integer idPaqueteHotel) { this.idPaqueteHotel = idPaqueteHotel; }

	@ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="id_hotel", nullable=false)
	public Hotel getHotel() { return hotel; }
	public void setHotel(Hotel hotel) { this.hotel = hotel; }

	@Column(name="nombre", length=45)
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }

	@Column(name="descripcion", length=250)
	public String getDescripcion() { return descripcion; }
	public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

	@Column(name="precio", precision=2)
	public Float getPrecio() { return precio; }
	public void setPrecio(Float precio) { this.precio = precio; }

	@Column(name="activo")
	public Boolean getActivo() { return activo; }
	public void setActivo(Boolean activo) { this.activo = activo; }

}
