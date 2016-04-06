package com.artiffex.scm.web.businesstier.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="hospedaje")
public class Hospedaje implements Serializable {

	private static final long serialVersionUID = 4631123349883310598L;
	
	private Integer idHospedaje;
	private Participante participante;
	private Hotel hotel;
	private Date fechaEntrada;
	private Date fechaSalida;
	private Integer numPersonasHabitacion;
	private Boolean activo;
	
	// constructor
	public Hospedaje() { }

	public Hospedaje(Integer idHospedaje, Participante participante,
			Hotel hotel, Date fechaEntrada, Date fechaSalida,
			Integer numPersonasHabitacion, Boolean activo) {
		super();
		this.idHospedaje = idHospedaje;
		this.participante = participante;
		this.hotel = hotel;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.numPersonasHabitacion = numPersonasHabitacion;
		this.activo = activo;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_hospedaje", unique=true, nullable=false)
	public Integer getIdHospedaje() { return idHospedaje; }
	public void setIdHospedaje(Integer idHospedaje) { this.idHospedaje = idHospedaje; }

	@OneToOne
	@JoinColumn(name="id_participante")
	public Participante getParticipante() { return participante; }
	public void setParticipante(Participante participante) { this.participante = participante; }

	@OneToOne
	@JoinColumn(name="id_hotel")
	public Hotel getHotel() { return hotel; }
	public void setHotel(Hotel hotel) { this.hotel = hotel; }

	@Column(name="fecha_entrada")
	public Date getFechaEntrada() { return fechaEntrada; }
	public void setFechaEntrada(Date fechaEntrada) { this.fechaEntrada = fechaEntrada; }

	@Column(name="fecha_salida")
	public Date getFechaSalida() { return fechaSalida; }
	public void setFechaSalida(Date fechaSalida) { this.fechaSalida = fechaSalida; }

	@Column(name="num_personas_habitacion")
	public Integer getNumPersonasHabitacion() { return numPersonasHabitacion; }
	public void setNumPersonasHabitacion(Integer numPersonasHabitacion) { this.numPersonasHabitacion = numPersonasHabitacion; }

	@Column(name="activo")
	public Boolean isActivo() { return activo; }
	public void setActivo(Boolean activo) { this.activo = activo; }
	
}
