package stepdefinition;

import org.openqa.selenium.WebDriver;

import base.MainReader;
import base.Objectfactory;
import base.ShortMethod;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runnerfile.Run_Audactin;

public class Audactin_SD extends ShortMethod{

	public static WebDriver driver=Run_Audactin.driver;
	public static Objectfactory obj=new Objectfactory(driver);

	@Given("^user lanching the application$")
	public void user_lanching_the_application() throws Throwable {
		geturl(MainReader.fileread().connection().geturl());
	}

	@When("^user enter \"([^\"]*)\" a username field$")
	public void user_enter_a_username_field(String user_name) throws Throwable {
		sendkeys(obj.getLoginpage().getUN(), user_name);
	}

	@And("^user enter \"([^\"]*)\" a password field$")
	public void user_enter_a_password_field(String password) throws Throwable {
		sendkeys(obj.getLoginpage().getPA(), password);
	}

	@Then("^user enter submit button$")
	public void user_enter_submit_button() throws Throwable {
		clickbutton(obj.getLoginpage().getLI());

	}

		@Given("^user select the area location$")
		public void user_select_the_area_location() throws Throwable {
			dropdown(obj.getGroup().getLocation(), "Visible Text", "Los Angeles");
		}

		@When("^user now select the hotels$")
		public void user_now_select_the_hotels() throws Throwable {
			dropdown(obj.getGroup().getHotel(), "byIndex", "3");
		}

		@And("^user select types of hotels$")
		public void user_select_types_of_hotels() throws Throwable {
			dropdown(obj.getGroup().getType(), "by value", "Super Deluxe");
		}

		@And("^user select the nos person stay in room$")
		public void user_select_the_nos_person_stay_in_room() throws Throwable {
			dropdown(obj.getGroup().getNos(), "by value", "10");
		}

		
		@And("^user select adult are there$")
		public void user_select_adult_are_there() throws Throwable {
			dropdown(obj.getGroup().getAdult(), "by value", "4");
		}

		@And("^user select Child are there$")
		public void user_select_Child_are_there() throws Throwable {
			dropdown(obj.getGroup().getAdult(), "by value", "4");
		}

		@Then("^user click the search button$")
		public void user_click_the_search_button() throws Throwable {
			clickbutton(obj.getGroup().getSubmit());
		}

		@Given("^user is select available hotels$")
		public void user_is_select_available_hotels() throws Throwable {
			clickbutton(obj.getradio().getRadio());
		}

		@Then("^user click the contine$")
		public void user_click_the_contine() throws Throwable {
			clickbutton(obj.getradio().getCon());
		}

		@Given("^user enter the first name$")
		public void user_enter_the_first_name() throws Throwable {
			sendkeys(obj.getBook().getAdd(), "karthikeyan");
		}

		@And("^user enter the last name$")
		public void user_enter_the_last_name() throws Throwable {
			sendkeys(obj.getBook().getLn(), "srg");
		}

		@And("^user enter the billing name$")
		public void user_enter_the_billing_name() throws Throwable {
			sendkeys(obj.getBook().getAdd(), "8/32, Dulpa road, South Africa");
		}

		@And("^user enter the credit card no$")
		public void user_enter_the_credit_card_no() throws Throwable {
			sendkeys(obj.getBook().getCc(), "123456789");
		}

		@And("^user enter the credit card type$")
		public void user_enter_the_credit_card_type() throws Throwable {
			dropdown(obj.getBook().getType(), "Visible Text", "VISA");
		}

		@And("^user enter the credit card expiry month$")
		public void user_enter_the_credit_card_expiry_month() throws Throwable {
			dropdown(obj.getBook().getMonth(), "Visible Text", "March");
		}

		@And("^user enter the credit card expiry Year$")
		public void user_enter_the_credit_card_expiry_Year() throws Throwable {
			dropdown(obj.getBook().getYear(), "Visible Text", "2015");
		}

		@Then("^finally user enter the credit card cvv no$")
		public void finally_user_enter_the_credit_card_cvv_no() throws Throwable {
			sendkeys(obj.getBook().getCvv(), "0907");
		}


	}
