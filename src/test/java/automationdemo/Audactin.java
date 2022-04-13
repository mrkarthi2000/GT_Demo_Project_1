package automationdemo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import base.MainReader;
import base.Objectfactory;
import base.ShortMethod;

public class Audactin extends ShortMethod{

	public static WebDriver driver=getbrowser("chrome");
	public static Objectfactory obj=new Objectfactory(driver);
	
	

	public static void main(String[] args) throws IOException{

		geturl(MainReader.fileread().connection().geturl());
		
		sendkeys(obj.getLoginpage().getUN(),"mrkarthikeyan");
		sendkeys(obj.getLoginpage().getPA(),"Thinkdifferent@#123");	
		clickbutton(obj.getLoginpage().getLI());
		dropdown(obj.getGroup().getLocation(), "Visible Text", "Los Angeles");
		dropdown(obj.getGroup().getHotel(), "byIndex", "3");
		dropdown(obj.getGroup().getType(), "by value", "Super Deluxe");
		dropdown(obj.getGroup().getNos(), "by value", "10");
		dropdown(obj.getGroup().getAdult(), "by value", "4");
		dropdown(obj.getGroup().getChild(), "by value", "4");
		clickbutton(obj.getGroup().getSubmit());
		clickbutton(obj.getradio().getRadio());
		clickbutton(obj.getradio().getCon());
		sendkeys(obj.getBook().getFn(),"mrkarthikeyan");
		sendkeys(obj.getBook().getLn(), "srg");
		sendkeys(obj.getBook().getAdd(), "8/32, Dulpa road, South Africa");
		sendkeys(obj.getBook().getCc(), "123456789");
		dropdown(obj.getBook().getType(), "Visible Text", "VISA");
		dropdown(obj.getBook().getMonth(), "Visible Text", "March");
		dropdown(obj.getBook().getYear(), "Visible Text", "2017");
		sendkeys(obj.getBook().getCvv(), "0900");

	}
}
