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
@Table(name="participante")
public class Participante implements Serializable {

	private static final long serialVersionUID = -3447631650878244265L;
	
	private Integer idParticipante;
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private String calle;
	private String numExterior;
	private String numInterior;
	private String colonia;
	private String delegacionMunicipio;
	private Estado estado;
	private String codigoPostal;
	private String telefonoParticular;
	private String telefonoCelular;
	private String telefonoOficina;
	private String email;
	private boolean aplicaAcompaniante;
	private boolean aplicaHospedaje;
	private boolean activo;

	// constructor
	public Participante() { }

	public Participante(Integer idParticipante, String nombre,
			String apPaterno, String apMaterno, String calle,
			String numExterior, String numInterior, String colonia,
			String delegacionMunicipio, Estado estado, String codigoPostal,
			String telefonoParticular, String telefonoCelular,
			String telefonoOficina, String email, boolean aplicaAcompaniante,
			boolean aplicaHospedaje, boolean activo) {
		super();
		this.idParticipante = idParticipante;
		this.nombre = nombre;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.calle = calle;
		this.numExterior = numExterior;
		this.numInterior = numInterior;
		this.colonia = colonia;
		this.delegacionMunicipio = delegacionMunicipio;
		this.estado = estado;
		this.codigoPostal = codigoPostal;
		this.telefonoParticular = telefonoParticular;
		this.telefonoCelular = telefonoCelular;
		this.telefonoOficina = telefonoOficina;
		this.email = email;
		this.aplicaAcompaniante = aplicaAcompaniante;
		this.aplicaHospedaje = aplicaHospedaje;
		this.activo = activo;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_participante", unique=true, nullable=false)
	public Integer getIdParticipante() { return idParticipante; }
	public void setIdParticipante(Integer idParticipante) { this.idParticipante = idParticipante; }

	@Column(name="nombre", length=80)
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }

	@Column(name="ap_paterno", length=45)
	public String getApPaterno() { return apPaterno; }
	public void setApPaterno(String apPaterno) { this.apPaterno = apPaterno; }

	@Column(name="ap_materno", length=45)
	public String getApMaterno() { return apMaterno; }
	public void setApMaterno(String apMaterno) { this.apMaterno = apMaterno; }
	
	@Column(name="calle", length=60)
	public String getCalle() { return calle; }
	public void setCalle(String calle) { this.calle = calle; }

	@Column(name="num_exterior", length=15)
	public String getNumExterior() { return numExterior; }
	public void setNumExterior(String numExterior) { this.numExterior = numExterior; }

	@Column(name="num_interior", length=15)
	public String getNumInterior() { return numInterior; }
	public void setNumInterior(String numInterior) { this.numInterior = numInterior; }

	@Column(name="colonia", length=60)
	public String getColonia() { return colonia; }
	public void setColonia(String colonia) { this.colonia = colonia; }

	@Column(name="delegacion_municipio", length=80)
	public String getDelegacionMunicipio() { return delegacionMunicipio; }
	public void setDelegacionMunicipio(String delegacionMunicipio) { this.delegacionMunicipio = delegacionMunicipio; }

	@OneToOne
	@JoinColumn(name="id_estado")
	public Estado getEstado() { return estado; }
	public void setEstado(Estado estado) { this.estado = estado; }

	@Column(name="codigo_postal", length=15)
	public String getCodigoPostal() { return codigoPostal; }
	public void setCodigoPostal(String codigoPostal) { this.codigoPostal = codigoPostal; }

	@Column(name="telefono_particular", length=15)
	public String getTelefonoParticular() { return telefonoParticular; }
	public void setTelefonoParticular(String telefonoParticular) { this.telefonoParticular = telefonoParticular; }

	@Column(name="telefono_celular", length=15)
	public String getTelefonoCelular() { return telefonoCelular; }
	public void setTelefonoCelular(String telefonoCelular) { this.telefonoCelular = telefonoCelular; }

	@Column(name="telefono_oficina", length=45)
	public String getTelefonoOficina() { return telefonoOficina; }
	public void setTelefonoOficina(String telefonoOficina) { this.telefonoOficina = telefonoOficina; }

	@Column(name="email", length=120)
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }

	@Column(name="aplica_acompaniante")
	public boolean isAplicaAcompaniante() { return aplicaAcompaniante; }
	public void setAplicaAcompaniante(boolean aplicaAcompaniante) { this.aplicaAcompaniante = aplicaAcompaniante; }

	@Column(name="aplica_hospedaje")
	public boolean isAplicaHospedaje() { return aplicaHospedaje; }
	public void setAplicaHospedaje(boolean aplicaHospedaje) { this.aplicaHospedaje = aplicaHospedaje; }

	@Column(name="activo")
	public boolean isActivo() { return activo; }
	public void setActivo(boolean activo) { this.activo = activo; }

}
