package com.cviniciusdr.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLStreamReader;

public class NewDataSet {
	public static NewDataSet xmlToBean(XMLStreamReader xsr) throws JAXBException {
        JAXBContext jb = JAXBContext.newInstance("br.com.coddera.util");
        Unmarshaller unmarshaller = jb.createUnmarshaller();
        NewDataSet newDataSet = (NewDataSet) unmarshaller.unmarshal(xsr);
        return newDataSet;
    }

}
