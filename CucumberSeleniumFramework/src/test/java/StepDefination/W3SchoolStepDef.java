package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.services.DriverServices;
import com.base.utils.IReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class W3SchoolStepDef {

	private WebDriver driver;
	private DriverServices service;
	private IReader readConfigFile;
	private WebDriverWait wait;

	public W3SchoolStepDef(DriverServices service) {
		this.service = service;
		this.driver = service.getDriver();
		this.readConfigFile = service.getiReadder();
	}
	
	@Given("^W_Navigate to \"([^\"]*)\"$")
	public void w_Navigate_to(String url) throws Throwable {
		driver.navigate().to(url);
	}

	@Then("^Click on \"([^\"]*)\" link$")
	public void click_on_link(String linkText) throws Throwable {
		//service.getObjButtonHelper().clickButton(By.xpath("//*[contains(text(),'Learn Machine Learning')]"));
		service.getObjButtonHelper().clickButton(By.xpath("//*[contains(text(),'"+linkText+"')]"));
		
	}

}
