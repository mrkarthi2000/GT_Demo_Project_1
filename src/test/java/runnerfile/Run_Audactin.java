package runnerfile;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import base.ShortMethod;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features  = "C:\\Users\\HP\\eclipse-workspace\\Maven_Demo_Project\\src\\test\\java\\featurefile\\Loginpage.feature",
glue = "stepdefinition", monochrome = true, plugin = { "html:Report/Cucumber_Report",
		"pretty",
		"json:Report/Cucumber.json",
"com.cucumber.listener.ExtentCucumberFormatter:Reports/extent_cucumber.html"})

public class Run_Audactin {


	public static WebDriver driver;
	@BeforeClass
	public static void setup() {
		driver=ShortMethod.getbrowser("chrome");

	}

	@AfterClass
	public static void teardown() {
		driver.close();

	}
}




