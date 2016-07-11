package com.artiffex.scm.web.businesstier.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name="pago")
public class Pago implements Serializable {

	private static final long serialVersionUID = 5275291337375913287L;
	
	private Integer idPago;
	private Participante participante;
	private BigDecimal costoCongresista;
	private BigDecimal costoAcompaniante;
	private BigDecimal costoColacionGrado;
	private BigDecimal costoHospedaje;
	private BigDecimal costoTotal;
	private BigDecimal importePago;
	private String nombreBanco;
	private String numSucursal;
	private String ciudad;
	private String numReferencia;
	private Date fechaTransaccion;
	private Boolean activo;
	
	// constructor
	public Pago() { }
	
	public Pago(Participante participante, BigDecimal costoCongresista, BigDecimal costoAcompaniante, BigDecimal costoColacionGrado,
			BigDecimal costoHospedaje, BigDecimal costoTotal, BigDecimal importePago, String nombreBanco, String numSucursal,
			String ciudad, String numReferencia, Boolean activo) {
		super();
		this.participante = participante;
		this.costoCongresista = costoCongresista;
		this.costoAcompaniante = costoAcompaniante;
		this.costoColacionGrado = costoColacionGrado;
		this.costoHospedaje = costoHospedaje;
		this.costoTotal = costoTotal;
		this.importePago = importePago;
		this.nombreBanco = nombreBanco;
		this.numSucursal = numSucursal;
		this.ciudad = ciudad;
		this.numReferencia = numReferencia;
		this.fechaTransaccion = null;
		this.activo = activo;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_pago", unique=true, nullable=false)
	public Integer getIdPago() { return idPago; }
	public void setIdPago(Integer idPago) { this.idPago = idPago; }

	@OneToOne
	@JoinColumn(name="id_participante")
	public Participante getParticipante() { return participante; }
	public void setParticipante(Participante participante) { this.participante = participante; }
	
	@Column(name="costo_congresista", precision=2)
	public BigDecimal getCostoCongresista() { return costoCongresista; }
	public void setCostoCongresista(BigDecimal costoCongresista) { this.costoCongresista = costoCongresista; }

	@Column(name="costo_acompaniante", precision=2)
	public BigDecimal getCostoAcompaniante() { return costoAcompaniante; }
	public void setCostoAcompaniante(BigDecimal costoAcompaniante) { this.costoAcompaniante = costoAcompaniante; }

	@Column(name="costo_colacion_grado", precision=2)
	public BigDecimal getCostoColacionGrado() { return costoColacionGrado; }
	public void setCostoColacionGrado(BigDecimal costoColacionGrado) { this.costoColacionGrado = costoColacionGrado; }

	@Column(name="costo_hospedaje", precision=2)
	public BigDecimal getCostoHospedaje() { return costoHospedaje; }
	public void setCostoHospedaje(BigDecimal costoHospedaje) { this.costoHospedaje = costoHospedaje; 	}

	@Column(name="costo_total", precision=2)
	public BigDecimal getCostoTotal() { return costoTotal; }
	public void setCostoTotal(BigDecimal costoTotal) { this.costoTotal = costoTotal; }
	
	@Column(name="importe_pago", precision=2)
	public BigDecimal getImportePago() { return importePago; }
	public void setImportePago(BigDecimal importePago) { this.importePago = importePago; }
	
	@Column(name="nombre_banco", length=60)
	public String getNombreBanco() { return nombreBanco; }
	public void setNombreBanco(String nombreBanco) { this.nombreBanco = nombreBanco; }

	@Column(name="num_sucursal", length=15)
	public String getNumSucursal() { return numSucursal; }
	public void setNumSucursal(String numSucursal) { this.numSucursal = numSucursal; }

	@Column(name="ciudad", length=45)
	public String getCiudad() { return ciudad; }
	public void setCiudad(String ciudad) { this.ciudad = ciudad; }

	@Column(name="num_referencia", length=15)
	public String getNumReferencia() { return numReferencia; }
	public void setNumReferencia(String numReferencia) { this.numReferencia = numReferencia; }

	@Column(name="fecha_transaccion")
	public Date getFechaTransaccion() { return fechaTransaccion; }
	public void setFechaTransaccion(Date fechaTransaccion) { this.fechaTransaccion = fechaTransaccion; }

	@Column(name="activo")
	public Boolean isActivo() { return activo; }
	public void setActivo(Boolean activo) { this.activo = activo; }
	
}
