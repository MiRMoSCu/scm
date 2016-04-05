package com.artiffex.scm.web.businesstier.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

public class ColacionGrado implements Serializable {

	private static final long serialVersionUID = 7527050000641243964L;
	
	private Integer idColacionGrado;
	private Participante participante;
	private Grado gradoPretende;
	private String cuerpoPretende;
	private Boolean activo;
	
	// constructor
	public ColacionGrado() { }

	public ColacionGrado(Integer idColacionGrado, Participante participante,
			Grado gradoPretende, String cuerpoPretende, Boolean activo) {
		super();
		this.idColacionGrado = idColacionGrado;
		this.participante = participante;
		this.gradoPretende = gradoPretende;
		this.cuerpoPretende = cuerpoPretende;
		this.activo = activo;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_colacion_grado", unique=true, nullable=false)
	public Integer getIdColacionGrado() { return idColacionGrado; }
	public void setIdColacionGrado(Integer idColacionGrado) { this.idColacionGrado = idColacionGrado; }

	@OneToOne
	@PrimaryKeyJoinColumn
	public Participante getParticipante() { return participante; }
	public void setParticipante(Participante participante) { this.participante = participante; }

	@OneToOne
	@PrimaryKeyJoinColumn
	public Grado getGradoPretende() { return gradoPretende; }
	public void setGradoPretende(Grado gradoPretende) { this.gradoPretende = gradoPretende; }

	@Column(name="cuerpo_pretende", length=80)
	public String getCuerpoPretende() { return cuerpoPretende; }
	public void setCuerpoPretende(String cuerpoPretende) { this.cuerpoPretende = cuerpoPretende; }

	@Column(name="activo")
	public Boolean isActivo() { return activo; }
	public void setActivo(Boolean activo) { this.activo = activo; }
	
}
