package com.artiffex.scm.web.businesstier.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="participante")
public class Participante implements Serializable {

	private static final long serialVersionUID = -3447631650878244265L;
	
	private Integer idParticipante;
	private String nombre;
	private Estado estado;
	private List<Acompañante> acompañante = new ArrayList<Acompañante>();
	
	public Participante() { }
	
	public Participante(Integer idParticipante, String nombre, Estado estado,
			List<Acompañante> acompañante) {
		super();
		this.idParticipante = idParticipante;
		this.nombre = nombre;
		this.estado = estado;
		this.acompañante = acompañante;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_participante", unique=true, nullable=false)
	public Integer getIdParticipante() { return idParticipante; }
	public void setIdParticipante(Integer idParticipante) { this.idParticipante = idParticipante; }

	@Column(name="nombre", length=80)
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }

	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	public Estado getEstado() { return estado; }
	public void setEstado(Estado estado) { this.estado = estado; }

	@OneToMany(cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
	@JoinColumn(name="id_participante")
	public List<Acompañante> getAcompañante() { return acompañante; }
	public void setAcompañante(List<Acompañante> acompañante) { this.acompañante = acompañante; }
	
}
