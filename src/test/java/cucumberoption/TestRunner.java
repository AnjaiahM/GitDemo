package cucumberoption;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/feature",
		glue = "StepDefinition",monochrome = true,
		plugin = {"pretty","html:./reports/html/login.html",
				"json:./reports/json/ligin.json"},dryRun = true
		
		
		)
public class TestRunner extends AbstractTestNGCucumberTests{

	
}
