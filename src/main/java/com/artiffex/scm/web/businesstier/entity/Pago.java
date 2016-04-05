package com.artiffex.scm.web.businesstier.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

public class Pago implements Serializable {

	private static final long serialVersionUID = 5275291337375913287L;
	
	private Integer idPago;
	private Participante participante;
	private Float importePago;
	private Date fechaTransaccion;
	private String banco;
	private Boolean activo;
	
	// constructor
	public Pago() { }

	public Pago(Integer idPago, Participante participante, Float importePago,
			Date fechaTransaccion, String banco, Boolean activo) {
		super();
		this.idPago = idPago;
		this.participante = participante;
		this.importePago = importePago;
		this.fechaTransaccion = fechaTransaccion;
		this.banco = banco;
		this.activo = activo;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_pago", unique=true, nullable=false)
	public Integer getIdPago() { return idPago; }
	public void setIdPago(Integer idPago) { this.idPago = idPago; }

	@OneToOne
	@PrimaryKeyJoinColumn
	public Participante getParticipante() { return participante; }
	public void setParticipante(Participante participante) { this.participante = participante; }

	@Column(name="importe_pago", precision=2)
	public Float getImportePago() { return importePago; }
	public void setImportePago(Float importePago) { this.importePago = importePago; }

	@Column(name="fecha_transaccion")
	public Date getFechaTransaccion() { return fechaTransaccion; }
	public void setFechaTransaccion(Date fechaTransaccion) { this.fechaTransaccion = fechaTransaccion; }

	@Column(name="banco", length=80)
	public String getBanco() { return banco; }
	public void setBanco(String banco) { this.banco = banco; }

	@Column(name="activo")
	public Boolean isActivo() { return activo; }
	public void setActivo(Boolean activo) { this.activo = activo; }
	
}
