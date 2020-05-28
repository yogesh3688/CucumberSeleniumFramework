package com.base.browser;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.base.utils.ResourceUtils;

public class CustomeChromeDriver {
	
	private void setDriverExecutable() {
		String chromedriverPath = ResourceUtils.getResourcePath("chromedriver83.exe");
		System.out.println("chrome driver path "+chromedriverPath);
	    System.setProperty("webdriver.chrome.driver", chromedriverPath);
	}
	
	private ChromeOptions getChromeOption() {
		ChromeOptions options = new ChromeOptions();
	    options.setAcceptInsecureCerts(true);
	    options.setHeadless(false);
	    //options.setPageLoadStrategy(PageLoadStrategy.NONE);
	    
	    return options;
	}
	
	private FirefoxOptions getFirefoxOption() {
		FirefoxOptions options = new FirefoxOptions();
	    options.setAcceptInsecureCerts(true);
	    options.setHeadless(false);
	    //options.setPageLoadStrategy(PageLoadStrategy.NONE);
	    
	    return options;
	}
	
	public WebDriver getChromeDriver() {
		setDriverExecutable();
		ChromeOptions options = getChromeOption();
		ChromeDriver driver = new ChromeDriver(options);
		return driver;
		
	}
	
	public WebDriver getFirefoxDriver() {
		setDriverExecutable();
		FirefoxOptions options = getFirefoxOption();
		FirefoxDriver driver = new FirefoxDriver(options);
		return driver;
		
	}

}
