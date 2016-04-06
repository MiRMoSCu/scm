package com.artiffex.scm.web.businesstier.utilidades;

import java.io.Serializable;

public class ComboSelect implements Serializable {

	private static final long serialVersionUID = 8410432630662372722L;
	
	private int value;
	private String text;
	
	// getters - setters
	
	public int getValue() { return value; }
	public void setValue(int value) { this.value = value; }
	
	public String getText() { return text; }
	public void setText(String text) { this.text = text; }

}
