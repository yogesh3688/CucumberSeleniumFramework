package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src/test/java/Features/W3School.feature"},
		glue = {"StepDefination","com.base.generatehook"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","json:target/report.json"}
		//plugin = {"pretty","html:Results/HTMLReport","junit:Results/JUnitReport/index.xml"}
		//tags = {"@regression"}  // will execute @regreesion scenarios from feature file
		)

public class W3SchoolRunner extends AbstractTestNGCucumberTests {

}
