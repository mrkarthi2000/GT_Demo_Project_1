package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Objectfactory {

	public static WebDriver driver;

	private Adactin_Loginpage loginpage ;
	private Book_Hotel  book;
	private  Adactin_Groupofhotels group;
	private Radiobutton radio;

	public Objectfactory(WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public Adactin_Loginpage getLoginpage() {
		loginpage=new Adactin_Loginpage(driver);
		return loginpage;
	}
	public Book_Hotel getBook() {
		book=new Book_Hotel(driver);
		return book;
	}
	public Adactin_Groupofhotels getGroup() {
		group=new Adactin_Groupofhotels(driver);	

		return group;
	}
	public Radiobutton getradio() {
		radio=new Radiobutton(driver);
		return radio;


	}
}