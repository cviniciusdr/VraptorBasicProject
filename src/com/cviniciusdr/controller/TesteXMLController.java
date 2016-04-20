package com.cviniciusdr.controller;

import java.io.IOException;
import java.util.Properties;

import javax.xml.bind.JAXBException;

import com.cviniciusdr.model.TesteXML;
import com.cviniciusdr.util.ConfigurationUtil;
import com.cviniciusdr.util.XmlUtil;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class TesteXMLController {

	private TesteXML xml;
	private Result result;
	private final String propertieName = "testeXML";
	private final String xmlFile;
	
	public TesteXMLController(Result result, TesteXML xml) throws IOException{
		this.result = result;
		this.xml = xml;
		Properties properties = ConfigurationUtil.getPropertiesDefault();
		this.xmlFile = properties.getProperty(propertieName);
	}

	@Get("/bloquearCartao")
	public TesteXML index(){
		try {
			xml = (TesteXML) XmlUtil.xmlToPojo(xml, xmlFile);
		}catch(Exception e ){}
		return xml;
	}
	
	@Post
	public void adiciona(TesteXML xml){
		
		try {
			XmlUtil.pojoToXml(xml,xmlFile );
		} catch (JAXBException e) { }
		result.include("alterado","alterado");
		result.redirectTo(TesteXMLController.class).index();
	}
}
