package com.cviniciusdr.util;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XmlUtil {

	/*
	 * M�todo n�o funciona na forma atual.
	 * Devido a necessidade de fazer o map manualmente, ele n�o funciona devido ao generic
	 * */
//	public static <T> T xmlToPojo(Class<T> tipoClasse, String arquivo)
//			throws JAXBException {
//		File file = new File(arquivo);
//
//		JAXBContext jaxbContext = JAXBContext.newInstance(tipoClasse);
//		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
//
//		T t = tipoClasse.cast(jaxbUnmarshaller.unmarshal(file));
//		
//		return t;
//	}

	
	
	/*
	 * Recebe um Xml e transforma em Objeto
	 * Retorno: Objeto
	 * Par�metros de entrada:
	 * 			- Object o = Objeto necess�rio para o Cast;
	 * 			- String arquivo = Patch + nome + extens�o do arquivo final
	 * 	
	 * */
	public static Object xmlToPojo(Object o, String arquivo) throws JAXBException {
		File file = new File(arquivo);
		
		JAXBContext jaxbContext = JAXBContext.newInstance(o.getClass());
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		
		return jaxbUnmarshaller.unmarshal(file);
		
	}
	
	
	/*
	 * M�todo n�o funciona na forma atual.
	 * Devido a necessidade de fazer o map manualmente, ele n�o funciona devido ao generic
	 * */
//	public static <T> void pojoToXml(Class<T> tipoClasse, String arquivo)
//			throws JAXBException {
//
//		File file = new File(arquivo);
//		JAXBContext jaxbContext = JAXBContext.newInstance(tipoClasse);
//		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
//
//		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//		jaxbMarshaller.marshal(tipoClasse, file);
//	}
	
	/*
	 * Recebe um Objeto e transforma em XML
	 * Retorno: void
	 * Par�metros de entrada:
	 * 			- Object o = Objeto inst�nciado com o mesmo tipo que ser� gerado o XML
	 * 			- String arquivo = Patch + nome + extens�o do arquivo final
	 * 	
	 * */
	public static void pojoToXml(Object o, String arquivo) throws JAXBException {
		File file = new File(arquivo);
		JAXBContext jaxbContext = JAXBContext.newInstance(o.getClass());
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		jaxbMarshaller.marshal(o, file);
	}
}