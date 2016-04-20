package com.cviniciusdr.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationUtil {
	
	
	
	public static Properties getProperties(String caminho) throws IOException { 
		Properties ppt = new Properties(); 
		FileInputStream fis = new FileInputStream(caminho); 
		ppt.load(fis); 
		return ppt; 
	}
	
	public static Properties getPropertiesDefault() throws IOException {
//		return getProperties("./properties/configuration.properties");
//		return getProperties("C:/properties/configuration.properties");
		return getProperties("/properties/configuration.properties");
		
	}

}
