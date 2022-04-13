package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	
	public static WebDriver driver;
	
	@FindBy(id = "first_name")
	private WebElement fn;
	
	@FindBy(id="last_name")
	private WebElement ln;
	
	@FindBy(id = "address")
	private WebElement add;
	
	@FindBy(id="cc_num")
	private WebElement cc;
	
	@FindBy(id="cc_type")
	private WebElement type;
	
	@FindBy(id="cc_exp_month")
	private WebElement month;
	
	@FindBy(id = "cc_exp_year")
	private WebElement year;
		
	public WebElement getFn() {
		return fn;
	}

	public WebElement getLn() {
		return ln;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCc() {
		return cc;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	@FindBy(id = "cc_cvv")
	private WebElement cvv;
	
	
	public Book_Hotel(WebDriver driver1) {
		driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
}
