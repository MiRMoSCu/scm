package com.artiffex.scm.web.businesstier.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="colacion_grado")
public class ColacionGrado implements Serializable {

	private static final long serialVersionUID = 7527050000641243964L;
	
	private Integer idColacionGrado;
	private Participante participante;
	private GradoPretende gradoPretende;
	private String cuerpoPretende;
	private String delegacionPretende;
	private Boolean activo;
	
	// constructor
	public ColacionGrado() { }
	
	public ColacionGrado(Participante participante, GradoPretende gradoPretende, String cuerpoPretende,
			String delegacionPretende, Boolean activo) {
		super();
		this.participante = participante;
		this.gradoPretende = gradoPretende;
		this.cuerpoPretende = cuerpoPretende;
		this.delegacionPretende = delegacionPretende;
		this.activo = activo;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_colacion_grado", unique=true, nullable=false)
	public Integer getIdColacionGrado() { return idColacionGrado; }
	public void setIdColacionGrado(Integer idColacionGrado) { this.idColacionGrado = idColacionGrado; }

	@OneToOne
	@JoinColumn(name="id_participante")
	public Participante getParticipante() { return participante; }
	public void setParticipante(Participante participante) { this.participante = participante; }

	@OneToOne
	@JoinColumn(name="id_grado_pretende")
	public GradoPretende getGradoPretende() { return gradoPretende; }
	public void setGradoPretende(GradoPretende gradoPretende) { this.gradoPretende = gradoPretende; }

	@Column(name="cuerpo_pretende", length=80)
	public String getCuerpoPretende() { return cuerpoPretende; }
	public void setCuerpoPretende(String cuerpoPretende) { this.cuerpoPretende = cuerpoPretende; }

	@Column(name="delegacion_pretende", length=120)
	public String getDelegacionPretende() { return delegacionPretende; }
	public void setDelegacionPretende(String delegacionPretende) { this.delegacionPretende = delegacionPretende; }

	@Column(name="activo")
	public Boolean isActivo() { return activo; }
	public void setActivo(Boolean activo) { this.activo = activo; }
	
}
