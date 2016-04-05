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
@Table(name="acompañante")
public class Acompañante implements Serializable {

	private static final long serialVersionUID = 1575427180416768348L;
	
	private Integer idAcompañante;
	private Participante participante;
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private Boolean activo;
	
	// constructor
	public Acompañante() { }
	
	public Acompañante(Integer idAcompañante, Participante participante,
			String nombre, Boolean activo) {
		super();
		this.idAcompañante = idAcompañante;
		this.participante = participante;
		this.nombre = nombre;
		this.activo = activo;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_acompañante", unique=true, nullable=false)
	public Integer getIdAcompañante() { return idAcompañante; }
	public void setIdAcompañante(Integer idAcompañante) { this.idAcompañante = idAcompañante; }

	@ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="id_participante", insertable=false, updatable=false, nullable=false)
	public Participante getParticipante() { return participante; }
	public void setParticipante(Participante participante) { this.participante = participante; }

	@Column(name="nombre", length=80)
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	
	@Column(name="ap_paterno", length=45)
	public String getApPaterno() { return apPaterno; }
	public void setApPaterno(String apPaterno) { this.apPaterno = apPaterno; }

	@Column(name="ap_materno", length=45)
	public String getApMaterno() { return apMaterno; }
	public void setApMaterno(String apMaterno) { this.apMaterno = apMaterno; }

	@Column(name="activo")
	public Boolean isActivo() { return activo; }
	public void setActivo(Boolean activo) { this.activo = activo; }

}
