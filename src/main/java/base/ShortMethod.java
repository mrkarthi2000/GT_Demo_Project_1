package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class ShortMethod {

	public static WebDriver driver;//null driver

	public static WebDriver getbrowser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", 
					System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();

		}
		driver.manage().window().maximize();
		return driver;

	}
	public static void implicitwait() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	public static void clickbutton (WebElement element) {
		element.click();

	}
	public static void sendkeys(WebElement element, String value) {
		element.sendKeys(value);
}	
	public static void geturl(String url) {
		driver.get(url);
	}

	public static void close() {
		driver.close();

	}
	public static void dropdown(WebElement element, String type, String value) {
		Select obj=new Select(element);

		if (type.equalsIgnoreCase("Visible Text")) {

			obj.selectByVisibleText(value);

		}
		else if(type.equalsIgnoreCase("by Value")) {

			obj.selectByValue(value);

		}
		else if(type.equalsIgnoreCase("byIndex")) {
			int byindex_value=Integer.parseInt(value);
			obj.selectByIndex(byindex_value);
}
}
}

