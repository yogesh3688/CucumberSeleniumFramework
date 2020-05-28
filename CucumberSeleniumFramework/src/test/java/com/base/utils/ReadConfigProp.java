package com.base.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;
import javax.management.RuntimeErrorException;

public class ReadConfigProp implements IReader {

	private Properties prop;
	
	public ReadConfigProp() {
		// TODO Auto-generated constructor stub
		initPropertiesFile("");
	}
	private void initPropertiesFile(String fileName) {
		System.out.println("fileName "+fileName);
		if(isDefaultPropertiesFile(fileName)) {
			prop = getDataFromProperties("config.properties");
				
			}else {
				prop = getDataFromProperties(fileName);
			}
		}
	
	
	private Properties getDataFromProperties(String fileName) {
		String path = ResourceUtils.getResourcePath(fileName);
		System.out.println("path : "+path);
		Properties prop = new Properties();
		try {
			InputStream stream = new FileInputStream(new File(path));
			prop.load(stream);
		}catch(Exception e) {
			throw new RuntimeException(e.getMessage());
		}
		return prop;
	}

	private boolean isDefaultPropertiesFile(String fileName) {
		if("".equalsIgnoreCase(fileName)) 
			return true;
		return false;
	}

	public String getApplicationURL() {
		return prop.getProperty("ApplicationUrl");
	}

	public String getUsername() {
		return prop.getProperty("Username");

	}

	public String getPassword() {
		return prop.getProperty("Password");

	}

	public int getExplicitWait() {
		return Integer.parseInt(prop.getProperty("ExplicitWait"));

	}
	public String getBrowserName() {
		return prop.getProperty("BrowserName");

	}

}
