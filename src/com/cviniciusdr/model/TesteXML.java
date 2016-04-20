package com.cviniciusdr.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "TesteXML")
public class TesteXML implements Serializable {
	
	private static final long serialVersionUID = -8759025221757395582L;

	@XmlElement(name = "Campo1")
    private String campo1;

	
	public String getCampo1() {
		return campo1;
	}


	public void setCampo1(String campo1) {
		this.campo1 = campo1;
	}


	@Override
	public String toString() {
		return "TesteXML [campo1=" + campo1 + "]";
	}


	
}