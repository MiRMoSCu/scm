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
@Table(name="acompaniante")
public class Acompaniante implements Serializable {

	private static final long serialVersionUID = 1575427180416768348L;
	
	private Integer idAcompaniante;
	private Participante participante;
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private Boolean activo;
	
	// constructor
	public Acompaniante() { }
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_acompaniante", unique=true, nullable=false)
	public Integer getIdAcompaniante() { return idAcompaniante; }
	public void setIdAcompaniante(Integer idAcompaniante) { this.idAcompaniante = idAcompaniante; }

	@ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="id_participante", nullable=false)
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
