package StepDefination;

import java.sql.Timestamp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.services.DriverServices;
import com.base.utils.IReader;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class KiteStepDefination {

	private WebDriver driver;
	private DriverServices service;
	private IReader readConfigFile;
	
	public KiteStepDefination(DriverServices service) {
		this.service = service;
		this.driver = service.getDriver();
		this.readConfigFile = service.getiReadder();
	}
	
	@Given("^Kite_I open chrome browser$")
	public void kite_i_open_chrome_browser() throws Throwable {
		//service.getObjBrowserHelper().getInstance(driver);
	}

	@When("^Kite_I naviagate to \"([^\"]*)\"$")
	public void kite_i_naviagate_to(String url) throws Throwable {
		//driver.get(url);
		driver.get(readConfigFile.getApplicationURL());
	}

	@When("^Kite_I enter user id \"([^\"]*)\" and password \"([^\"]*)\" and click Login button$")
	public void kite_i_enter_user_id_and_password_and_click_Login_button(String userid, String password) throws Throwable {
		service.getObjTextBoxHelper().setText(By.xpath("//*[@id='j_username_pick']"), readConfigFile.getUsername());
		service.getObjTextBoxHelper().setText(By.xpath("//*[@id='j_userpassword_pick_chrome']"), readConfigFile.getPassword());
		
	}

	@When("^Kite_I enter Pin \"([^\"]*)\" and click on continue button$")
	public void kite_i_enter_Pin_and_click_on_continue_button(String arg1) throws Throwable {
		service.getObjButtonHelper().clickButton(By.xpath("//*[@id='loginbtnbg']"));
	}

	

	@Then("^Kite_click on Logout$")
	public void kite_click_on_Logout() throws Throwable {
		service.getObjButtonHelper().clickButton(By.xpath("//a[contains(text(),'Logout')]"));
	}

	@Then("^Close the Browser$")
	public void close_the_Browser() throws Throwable {
	    
	}
	
	@Then("^Kite_TakeScreenshot of page$")
	public void kite_takescreenshot_of_page() throws Throwable {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		String filename  = timestamp.toString().replaceAll("[^\\\\.A-Za-z0-9_]", "_").replace(".", "_");
	    service.getGenericHelper().takeScreenshot("Screenshots", filename);
	    
	}

}
