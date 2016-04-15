package com.artiffex.scm.web.webtier.validation;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



public class Jsp08RegistroForm {

	@NotNull
	@Size(min=2, max=45)
	private String participante_ap_paterno;
	
	@NotNull
	@Size(min=2, max=45)
	private String participante_ap_materno;
	
	@NotNull
	@Size(min=2, max=45)
	private String participante_nombre;
	

	public String getParticipante_ap_paterno() {
		return participante_ap_paterno;
	}

	public void setParticipante_ap_paterno(String participante_ap_paterno) {
		this.participante_ap_paterno = participante_ap_paterno;
	}

	public String getParticipante_ap_materno() {
		return participante_ap_materno;
	}

	public void setParticipante_ap_materno(String participante_ap_materno) {
		this.participante_ap_materno = participante_ap_materno;
	}

	public String getParticipante_nombre() {
		return participante_nombre;
	}

	public void setParticipante_nombre(String participante_nombre) {
		this.participante_nombre = participante_nombre;
	}
	
}
