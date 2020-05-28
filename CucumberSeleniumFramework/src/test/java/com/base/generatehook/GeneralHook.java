package com.base.generatehook;

import java.sql.Timestamp;

import org.openqa.selenium.WebDriver;

import com.base.services.DriverServices;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class GeneralHook {

	private DriverServices services;
	private WebDriver driver;
	
	public GeneralHook(DriverServices services) {
		this.services = services;
		this.driver = services.getDriver();
	}
	
	@Before
	public void settUp() {
		
	}
	
	@After
	public void tearDown(Scenario scenario) {
		
		if(scenario.isFailed()) {
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			String filename  = timestamp.toString().replaceAll("[^\\\\.A-Za-z0-9_]", "_").replace(".", "_");
		    //services.getGenericHelper().takeScreenshot("Screenshots", filename);
		    //scenario.embed(services.getGenericHelper().takeScreenshot(), "image/png");
		}
		
		 if(driver!=null)
				driver.quit();
		    	//driver.close();
		    try {
		    	Runtime.getRuntime().exec("taskkill /F /IM iexplore.exe");
			} catch (Exception e) {
				// TODO: handle exception
			}
	}
	
}
