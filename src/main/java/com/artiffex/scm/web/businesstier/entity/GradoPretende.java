package com.artiffex.scm.web.businesstier.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="grado_pretende")
public class GradoPretende implements Serializable {

	private static final long serialVersionUID = -4575129071458636924L;
	
	private Integer idGradoPretende;
	private String nombre;
	private String descripcion;
	private Boolean activo;
	// relaciones de uno a muchos que mantiene con otras tablas
	private List<GradoPretendePrecio> listaGradoPretendePrecio;
	
	// constructor
	public GradoPretende() { }
	
	public GradoPretende(Integer idGradoPretende) {
		super();
		this.idGradoPretende = idGradoPretende;
	}

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

	@Column(name="activo")
	public Boolean getActivo() { return activo; }
	public void setActivo(Boolean activo) { this.activo = activo; }

	@OneToMany
	@JoinColumn(name="id_grado_pretende")
	public List<GradoPretendePrecio> getListaGradoPretendePrecio() { return listaGradoPretendePrecio; }
	public void setListaGradoPretendePrecio( List<GradoPretendePrecio> listaGradoPretendePrecio) { this.listaGradoPretendePrecio = listaGradoPretendePrecio; }
	
}
 