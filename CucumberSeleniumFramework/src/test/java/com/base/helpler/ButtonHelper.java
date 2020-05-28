package com.base.helpler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonHelper {
	private static ButtonHelper buttonHelper;
	private static WebDriver wdDriver;
	private WebElement element;
	
	public ButtonHelper(WebDriver driver) {
		this.wdDriver = driver;
	}
	
	public static ButtonHelper getInstance(WebDriver driver) {
		if(buttonHelper==null || wdDriver.hashCode()!=driver.hashCode()) {
			buttonHelper = new ButtonHelper(driver);
		}
		return buttonHelper;
	}
	
	public void clickButton(By locator) {
		element = wdDriver.findElement(locator);
		element.click();
	}
}
