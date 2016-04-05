package com.artiffex.scm.web.businesstier.utilidades;

import java.io.Serializable;

public class ComboSelect implements Serializable {

	private static final long serialVersionUID = 8410432630662372722L;
	
	private String text;
	private String value;
	
	// getters - setters
	
	public String getText() { return text; }
	public void setText(String text) { this.text = text; }
	
	public String getValue() { return value; }
	public void setValue(String value) { this.value = value; }

}
