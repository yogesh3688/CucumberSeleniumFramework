package com.base.helpler;

import org.openqa.selenium.WebDriver;

public class BrowserHelpler {

	private static BrowserHelpler browserHelper;
	private WebDriver driver;
	
	public BrowserHelpler(WebDriver driver) {
		this.driver = driver;
	}
	
	public static BrowserHelpler getInstance(WebDriver driver) {
		if(browserHelper==null)
			browserHelper = new BrowserHelpler(driver);
		return browserHelper;
	}
}
