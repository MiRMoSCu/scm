package com.artiffex.scm.web.businesstier.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="parametro_configuracion")
public class ParametroConfiguracion implements Serializable {

	private static final long serialVersionUID = -1393447383696932412L;
	
	private Integer idParametroConfiguracion;
	private String nombre;
	private Integer valorInt;
	private Float valorFloat;
	private String valorString;
	private Boolean valorBoolean;
	private Boolean activo;
	
	// constructor
	public ParametroConfiguracion() { }
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_parametro_configuracion", unique=true, nullable=false)
	public Integer getIdParametroConfiguracion() { return idParametroConfiguracion; }
	public void setIdParametroConfiguracion(Integer idParametroConfiguracion) { this.idParametroConfiguracion = idParametroConfiguracion; }
	
	@Column(name="nombre", length=80)
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	
	@Column(name="valor_int")
	public Integer getValorInt() { return valorInt; }
	public void setValorInt(Integer valorInt) { this.valorInt = valorInt; }
	
	@Column(name="valor_float")
	public Float getValorFloat() { return valorFloat; }
	public void setValorFloat(Float valorFloat) { this.valorFloat = valorFloat; }
	
	@Column(name="valor_string", length=120)
	public String getValorString() { return valorString; }
	public void setValorString(String valorString) { this.valorString = valorString; }
	
	@Column(name="valor_boolean")
	public Boolean getValorBoolean() { return valorBoolean; }
	public void setValorBoolean(Boolean valorBoolean) { this.valorBoolean = valorBoolean; }
	
	@Column(name="activo")
	public Boolean getActivo() { return activo; }
	public void setActivo(Boolean activo) { this.activo = activo; }

}
