package com.cviniciusdr.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "AuditoriaBase")
public class AuditoriaBase {

	@XmlElement(name = "Identificador")
	private String identificador;
	
	@XmlElement(name = "ChaveSolicitacaoRelacionada")
	private String chaveSolicitacaoRelacionada;
	
	@XmlElement(name = "InicioProcessamento")
	private String inicioProcessamento;
	
	@XmlElement(name = "FimProcessamento")
	private String fimProcessamento;
	
	@XmlElement(name = "ServidorResponsavel")
	private String servidorResponsavel;
	
	
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getChaveSolicitacaoRelacionada() {
		return chaveSolicitacaoRelacionada;
	}
	public void setChaveSolicitacaoRelacionada(String chaveSolicitacaoRelacionada) {
		this.chaveSolicitacaoRelacionada = chaveSolicitacaoRelacionada;
	}
	public String getInicioProcessamento() {
		return inicioProcessamento;
	}
	public void setInicioProcessamento(String inicioProcessamento) {
		this.inicioProcessamento = inicioProcessamento;
	}
	public String getFimProcessamento() {
		return fimProcessamento;
	}
	public void setFimProcessamento(String fimProcessamento) {
		this.fimProcessamento = fimProcessamento;
	}
	public String getServidorResponsavel() {
		return servidorResponsavel;
	}
	public void setServidorResponsavel(String servidorResponsavel) {
		this.servidorResponsavel = servidorResponsavel;
	}

	
	
}
