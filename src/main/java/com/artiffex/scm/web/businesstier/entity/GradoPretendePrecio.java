package com.artiffex.scm.web.businesstier.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="grado_pretende_precio")
public class GradoPretendePrecio implements Serializable {

	private static final long serialVersionUID = 885961224120920838L;
	
	private Integer idGradoPretendePrecio;
	private GradoPretende gradoPretende;
	private Date fechaInicio;
	private Date fechaFin;
	private Float precio;
	private Boolean activo;
	
	// constructor
	public GradoPretendePrecio() { }
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_grado_pretende_precio", unique=true, nullable=false)
	public Integer getIdGradoPretendePrecio() { return idGradoPretendePrecio; }
	public void setIdGradoPretendePrecio(Integer idGradoPretendePrecio) { this.idGradoPretendePrecio = idGradoPretendePrecio; }
	
	@ManyToOne
	@JoinColumn(name="id_grado_pretende")
	public GradoPretende getGradoPretende() { return gradoPretende; }
	public void setGradoPretende(GradoPretende gradoPretende) { this.gradoPretende = gradoPretende; }

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
