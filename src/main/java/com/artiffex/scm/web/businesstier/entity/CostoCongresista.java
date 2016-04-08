package com.artiffex.scm.web.businesstier.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="costo_congresista")
public class CostoCongresista implements Serializable {

	private static final long serialVersionUID = 1933864763235310404L;
	
	private Integer idCostoCongresista;
	private Date fechaInicio;
	private Date fechaFin;
	private Float precio;
	private Boolean activo;
	
	// constructor
	public CostoCongresista() { }

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_costo_congresista", unique=true, nullable=false)
	public Integer getIdCostoCongresista() { return idCostoCongresista; }
	public void setIdCostoCongresista(Integer idCostoCongresista) { this.idCostoCongresista = idCostoCongresista; }

	@Column(name="fecha_inicio")
	public Date getFechaInicio() { return fechaInicio; }
	public void setFechaInicio(Date fechaInicio) { this.fechaInicio = fechaInicio; }

	@Column(name="fecha_fin")
	public Date getFechaFin() { return fechaFin; }
	public void setFechaFin(Date fechaFin) { this.fechaFin = fechaFin; }

	@Column(name="precio", precision=2)
	public Float getPrecio() { return precio; }
	public void setPrecio(Float precio) { this.precio = precio; }

	@Column(name="activo")
	public Boolean getActivo() { return activo; }
	public void setActivo(Boolean activo) { this.activo = activo; }
	
}
