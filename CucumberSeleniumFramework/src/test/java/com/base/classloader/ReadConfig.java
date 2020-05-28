package com.base.classloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfig {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		InputStream stream = new FileInputStream(new File("D:\\eclipse-workspace\\SimpleSeleniumCucumber\\src\\test\\resources\\config.properties"));
		prop.load(stream);
		System.out.println(prop.getProperty("BrowserName"));
	}
}
