package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Loginpage {
	
	public static WebDriver driver;
	
	@FindBy(id = "username")
		private WebElement UN;

	@FindBy(id = "password")
	private WebElement PA;
	
	@FindBy (id = "login")
	private WebElement LI;
	

	public Adactin_Loginpage(WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUN() {
		return UN;
	}

	public WebElement getPA() {
		return PA;
	}
	
	public WebElement getLI() {
		return LI;
	}
	
	
	
	}
