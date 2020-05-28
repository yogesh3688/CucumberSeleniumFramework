package com.base.helpler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxHelper {

	private static TextBoxHelper textBoxHelper;
	private static WebDriver wdDriver;
	
	public TextBoxHelper(WebDriver driver) {
		wdDriver = driver;
	}
	
	public static TextBoxHelper getInstance(WebDriver driver) {
		if(textBoxHelper==null || wdDriver.hashCode()!=driver.hashCode()) {
			textBoxHelper = new TextBoxHelper(driver);
		}
		return textBoxHelper;
	}
	
	public void setText(By locator,String value) {
		
	}
}
