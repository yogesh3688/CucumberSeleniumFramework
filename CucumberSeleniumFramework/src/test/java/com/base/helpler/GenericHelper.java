package com.base.helpler;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class GenericHelper {

	private static GenericHelper genericHelper;
	private static WebDriver wdDriver;
	
	
	public GenericHelper(WebDriver driver) {
		wdDriver = driver;
	}
	
	public static GenericHelper getInstance(WebDriver driver) {
		if(genericHelper==null || wdDriver.hashCode()!=driver.hashCode()) {
			genericHelper = new GenericHelper(driver);
		}
		return genericHelper;
	}
	
	public void takeScreenshot(String aDir, String bFileName) {
		File directory = new File(aDir);
		
		if(!directory.exists())
			directory.mkdir();
		
		File screenshot = ((TakesScreenshot)wdDriver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot,new File(directory.getAbsoluteFile()+File.separator+bFileName+".png"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}
	
	public byte[] takeScreenshot() {
		byte [] screenshot = ((TakesScreenshot)wdDriver).getScreenshotAs(OutputType.BYTES);
		
		return screenshot;
		
			
	}
}
