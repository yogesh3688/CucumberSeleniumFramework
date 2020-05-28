package com.base.services;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.browser.CustomFirefoxDriver;
import com.base.browser.CustomeChromeDriver;
import com.base.helpler.BrowserHelpler;
import com.base.helpler.ButtonHelper;
import com.base.helpler.GenericHelper;
import com.base.helpler.TextBoxHelper;
import com.base.utils.IReader;
import com.base.utils.ReadConfigProp;

public class DriverServices {
	
	private WebDriver driver;
	
	private BrowserHelpler objBrowserHelper;
	private WebDriverWait wait;
	private TextBoxHelper objTextBoxHelper;
	private ButtonHelper objButtonHelper;
	private IReader readder;
	private GenericHelper genericHelper;
	
	

	
	public void launchBrowser() {
		CustomeChromeDriver chromeDriver = new CustomeChromeDriver();
		readder = new ReadConfigProp();
	    driver = chromeDriver.getChromeDriver();
	    
		//CustomFirefoxDriver ffdriver = new CustomFirefoxDriver();
		//driver = ffdriver.getFirefoxDriver();
	    //driver = getBrowserDriver();
	    driver.manage().window().maximize();
	    objBrowserHelper=BrowserHelpler.getInstance(driver);
	    objButtonHelper = ButtonHelper.getInstance(driver);
	    objTextBoxHelper = TextBoxHelper.getInstance(driver);
	    
	}
/*
	private WebDriver getBrowserDriver() {
		
		switch (readder.getBrowserType()) {
		case BrowserType.CHROME:
			CustomeChromeDriver chromeDriver = new CustomeChromeDriver();
			return chromeDriver.getChromeDriver();
		default:
			break;
		}
	}
*/
	public BrowserHelpler getObjBrowserHelper() {
		return objBrowserHelper;
	}
	
	public TextBoxHelper getObjTextBoxHelper() {
		return objTextBoxHelper;
	}

	public ButtonHelper getObjButtonHelper() {
		return objButtonHelper;
	}


	public WebDriver getDriver() {
		return driver;
	}

	public IReader getiReadder() {
		return readder;
	}
	
	public DriverServices() {
		launchBrowser();
		}
	
	public GenericHelper getGenericHelper() {
		return genericHelper;
	}
	
}
