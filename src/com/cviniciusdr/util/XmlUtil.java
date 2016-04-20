package com.cviniciusdr.util;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XmlUtil {

	/*
	 * Método não funciona na forma atual.
	 * Devido a necessidade de fazer o map manualmente, ele não funciona devido ao generic
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
	 * Parâmetros de entrada:
	 * 			- Object o = Objeto necessário para o Cast;
	 * 			- String arquivo = Patch + nome + extensão do arquivo final
	 * 	
	 * */
	public static Object xmlToPojo(Object o, String arquivo) throws JAXBException {
		File file = new File(arquivo);
		
		JAXBContext jaxbContext = JAXBContext.newInstance(o.getClass());
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		
		return jaxbUnmarshaller.unmarshal(file);
		
	}
	
	
	/*
	 * Método não funciona na forma atual.
	 * Devido a necessidade de fazer o map manualmente, ele não funciona devido ao generic
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
	 * Parâmetros de entrada:
	 * 			- Object o = Objeto instânciado com o mesmo tipo que será gerado o XML
	 * 			- String arquivo = Patch + nome + extensão do arquivo final
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