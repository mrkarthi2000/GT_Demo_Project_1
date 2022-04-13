package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Groupofhotels {

	public static WebDriver driver;

	@FindBy(id="location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotel;

	@FindBy(id = "room_type")
	private WebElement type;

	@FindBy(id = "room_nos")
	private WebElement nos;

	@FindBy(id = "adult_room")
	private WebElement adult;

	@FindBy (id = "child_room")
	private WebElement child;

	@FindBy(id = "Submit")
	private WebElement submit;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getNos() {
		return nos;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public Adactin_Groupofhotels(WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver, this);
	}

	





}
