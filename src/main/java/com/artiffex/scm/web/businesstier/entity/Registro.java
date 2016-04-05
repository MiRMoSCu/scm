package com.artiffex.scm.web.businesstier.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

public class Registro implements Serializable {

	private static final long serialVersionUID = -7085598198310935877L;
	
	private Integer idRegistro;
	private Participante participante;
	private Grado grado;
	private String nombreCuerpo;
	private String delegacion;
	private TipoParticipacion tipoParticipacion;
	private TipoPonencia tipoPonencia;
	private Boolean activo;
	
	// constructor
	public Registro() { }

	public Registro(Integer idRegistro, Participante participante, Grado grado,
			String nombreCuerpo, String delegacion,
			TipoParticipacion tipoParticipacion, TipoPonencia tipoPonencia) {
		super();
		this.idRegistro = idRegistro;
		this.participante = participante;
		this.grado = grado;
		this.nombreCuerpo = nombreCuerpo;
		this.delegacion = delegacion;
		this.tipoParticipacion = tipoParticipacion;
		this.tipoPonencia = tipoPonencia;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_registro", unique=true, nullable=false)
	public Integer getIdRegistro() { return idRegistro; }
	public void setIdRegistro(Integer idRegistro) { this.idRegistro = idRegistro; }

	@OneToOne
	@PrimaryKeyJoinColumn
	public Participante getParticipante() { return participante; }
	public void setParticipante(Participante participante) { this.participante = participante; }

	@OneToOne
	@PrimaryKeyJoinColumn
	public Grado getGrado() { return grado; }
	public void setGrado(Grado grado) { this.grado = grado; }

	@Column(name="nombre_cuerpo", length=45)
	public String getNombreCuerpo() { return nombreCuerpo; }
	public void setNombreCuerpo(String nombreCuerpo) { this.nombreCuerpo = nombreCuerpo; }

	@Column(name="delegacion", length=45)
	public String getDelegacion() { return delegacion; }
	public void setDelegacion(String delegacion) { this.delegacion = delegacion; }

	@OneToOne
	@PrimaryKeyJoinColumn
	public TipoParticipacion getTipoParticipacion() { return tipoParticipacion; }
	public void setTipoParticipacion(TipoParticipacion tipoParticipacion) { this.tipoParticipacion = tipoParticipacion; }

	@OneToOne
	@PrimaryKeyJoinColumn
	public TipoPonencia getTipoPonencia() { return tipoPonencia; }
	public void setTipoPonencia(TipoPonencia tipoPonencia) { this.tipoPonencia = tipoPonencia; }

	@Column(name="activo")
	public Boolean isActivo() { return activo; }
	public void setActivo(Boolean activo) { this.activo = activo; }
	
}
