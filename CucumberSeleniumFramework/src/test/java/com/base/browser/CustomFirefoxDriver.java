package com.base.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class CustomFirefoxDriver {
	private void setDriverExecutable() {
	    System.setProperty("wedriver.gecko.driver", "/SimpleSeleniumCucumber/Drivers/geckodriver.exe");

	}
	
	
	
	private FirefoxOptions getFirefoxOption() {
		FirefoxOptions options = new FirefoxOptions();
	    options.setAcceptInsecureCerts(true);
	    options.setHeadless(false);
	    //options.setPageLoadStrategy(PageLoadStrategy.NONE);
	    
	    return options;
	}
	
	
	
	public WebDriver getFirefoxDriver() {
		setDriverExecutable();
		FirefoxOptions options = getFirefoxOption();
		FirefoxDriver driver = new FirefoxDriver(options);
		return driver;
		
	}
}
