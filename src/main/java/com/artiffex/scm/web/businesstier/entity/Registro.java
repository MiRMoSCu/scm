package com.artiffex.scm.web.businesstier.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="registro")
public class Registro implements Serializable {

	private static final long serialVersionUID = -7085598198310935877L;
	
	private Integer idRegistro;
	private Participante participante;
	private Grado grado;
	private String nombreCuerpo;
	private String delegacion;
	private TipoParticipacion tipoParticipacion;
	private TipoPonencia tipoPonencia;
	private String tituloPonencia;
	private TipoMesa tipoMesa;
	private Date fechaRegistro;
	private Boolean activo;
	
	// constructor
	public Registro() { }

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_registro", unique=true, nullable=false)
	public Integer getIdRegistro() { return idRegistro; }
	public void setIdRegistro(Integer idRegistro) { this.idRegistro = idRegistro; }

	@OneToOne
	@JoinColumn(name="id_participante")
	public Participante getParticipante() { return participante; }
	public void setParticipante(Participante participante) { this.participante = participante; }

	@OneToOne
	@JoinColumn(name="id_grado")
	public Grado getGrado() { return grado; }
	public void setGrado(Grado grado) { this.grado = grado; }

	@Column(name="nombre_cuerpo", length=45)
	public String getNombreCuerpo() { return nombreCuerpo; }
	public void setNombreCuerpo(String nombreCuerpo) { this.nombreCuerpo = nombreCuerpo; }

	@Column(name="delegacion", length=45)
	public String getDelegacion() { return delegacion; }
	public void setDelegacion(String delegacion) { this.delegacion = delegacion; }

	@OneToOne
	@JoinColumn(name="id_tipo_participacion")
	public TipoParticipacion getTipoParticipacion() { return tipoParticipacion; }
	public void setTipoParticipacion(TipoParticipacion tipoParticipacion) { this.tipoParticipacion = tipoParticipacion; }

	@OneToOne
	@JoinColumn(name="id_tipo_ponencia")
	public TipoPonencia getTipoPonencia() { return tipoPonencia; }
	public void setTipoPonencia(TipoPonencia tipoPonencia) { this.tipoPonencia = tipoPonencia; }
	
	@Column(name="titulo_ponencia", length=120)
	public String getTituloPonencia() { return tituloPonencia; }
	public void setTituloPonencia(String tituloPonencia) { this.tituloPonencia = tituloPonencia; }

	@OneToOne
	@JoinColumn(name="id_tipo_mesa")
	public TipoMesa getTipoMesa() { return tipoMesa; }
	public void setTipoMesa(TipoMesa tipoMesa) { this.tipoMesa = tipoMesa; }
	
	@Column(name="fecha_registro")
	public Date getFechaRegistro() { return fechaRegistro; }
	public void setFechaRegistro(Date fechaRegistro) { this.fechaRegistro = fechaRegistro; }

	@Column(name="activo")
	public Boolean isActivo() { return activo; }
	public void setActivo(Boolean activo) { this.activo = activo; }

}
