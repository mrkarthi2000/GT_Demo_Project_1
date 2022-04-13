package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Radiobutton {
	
	public static WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement radio;
	
	@FindBy(id = "continue")
	private WebElement con;

	public WebElement getCon() {
		return con;
	}
	public WebElement getRadio() {
		return radio;
		
	}
	public Radiobutton(WebDriver driver2) {
		driver=driver2;	
		PageFactory.initElements(driver, this);
	}


}
