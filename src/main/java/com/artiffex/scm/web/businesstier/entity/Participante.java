package com.artiffex.scm.web.businesstier.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="participante")
public class Participante implements Serializable {

	private static final long serialVersionUID = -3447631650878244265L;
	
	private Integer idParticipante;
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private String delegacionMunicipio;
	private String ciudad;
	private Estado estado;
	private String codigoPostal;
	private String telefonoParticular;
	private String telefonoelular;
	private String telefonoOficina;
	private String email;
	private Boolean aplicaAcompañante;
	private Boolean aplicaHospedaje;
	private Boolean activo;

	// constructor
	public Participante() { }

	public Participante(Integer idParticipante, String nombre,
			String apPaterno, String apMaterno, String delegacionMunicipio,
			String ciudad, Estado estado, String codigoPostal,
			String telefonoParticular, String telefonoelular,
			String telefonoOficina, String email, Boolean aplicaAcompañante,
			Boolean aplicaHospedaje, Boolean activo) {
		super();
		this.idParticipante = idParticipante;
		this.nombre = nombre;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.delegacionMunicipio = delegacionMunicipio;
		this.ciudad = ciudad;
		this.estado = estado;
		this.codigoPostal = codigoPostal;
		this.telefonoParticular = telefonoParticular;
		this.telefonoelular = telefonoelular;
		this.telefonoOficina = telefonoOficina;
		this.email = email;
		this.aplicaAcompañante = aplicaAcompañante;
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

	@Column(name="delegacion_municipio", length=80)
	public String getDelegacionMunicipio() { return delegacionMunicipio; }
	public void setDelegacionMunicipio(String delegacionMunicipio) { this.delegacionMunicipio = delegacionMunicipio; }

	@Column(name="ciudad", length=80)
	public String getCiudad() { return ciudad; }
	public void setCiudad(String ciudad) { this.ciudad = ciudad; }

	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	public Estado getEstado() { return estado; }
	public void setEstado(Estado estado) { this.estado = estado; }

	@Column(name="codigo_postal", length=15)
	public String getCodigoPostal() { return codigoPostal; }
	public void setCodigoPostal(String codigoPostal) { this.codigoPostal = codigoPostal; }

	@Column(name="telefono_particular", length=15)
	public String getTelefonoParticular() { return telefonoParticular; }
	public void setTelefonoParticular(String telefonoParticular) { this.telefonoParticular = telefonoParticular; }

	@Column(name="telefono_celular", length=15)
	public String getTelefonoelular() { return telefonoelular; }
	public void setTelefonoelular(String telefonoelular) { this.telefonoelular = telefonoelular; }

	@Column(name="telefono_oficina", length=45)
	public String getTelefonoOficina() { return telefonoOficina; }
	public void setTelefonoOficina(String telefonoOficina) { this.telefonoOficina = telefonoOficina; }

	@Column(name="email", length=120)
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }

	@Column(name="aplica_acompañante", nullable=true)
	public Boolean isAplicaAcompañante() { return aplicaAcompañante; }
	public void setAplicaAcompañante(Boolean aplicaAcompañante) { this.aplicaAcompañante = aplicaAcompañante; }

	@Column(name="aplica_hospedaje", nullable=true)
	public Boolean isAplicaHospedaje() { return aplicaHospedaje; }
	public void setAplicaHospedaje(Boolean aplicaHospedaje) { this.aplicaHospedaje = aplicaHospedaje; }

	@Column(name="activo", nullable=true)
	public Boolean isActivo() { return activo; }
	public void setActivo(Boolean activo) { this.activo = activo; }
	
}
