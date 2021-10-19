package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;
import com.adactin.baseclass.BaseClass;
import com.adactin.configuration.File_Reader_Manager;
import com.adactin.configuration.PageObjectManager;
import com.adactin.runner.Runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends BaseClass {
	
	public static WebDriver driver = Runner.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);
	
	@Given("^User want to launch the adactin application$")
	public void user_want_to_launch_the_adactin_application() throws Throwable {
	 String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
	 getUrl(url);
	}
	
	@When("User enter {string} the valid username")
	public void user_enter_the_valid_username(String string) {
		 SendKeys(pom.getInstanceLoginPage().getOurname(), string);
	}
	@When("User enter {string} the valid password")
	public void user_enter_the_valid_password(String string) {
		SendKeys(pom.getInstanceLoginPage().getOurpass(), string);
	}

	@Then("^User verify the valid username and password$")
	public void user_verify_the_valid_username_and_password() throws Throwable {
	    clickOnElement(pom.getInstanceLoginPage().getLogin());
	}

    @Given("User want to select the location")
    public void user_want_to_select_the_location() {
       dropDown(pom.getInstanceSearchHotel().getSelectLocation(), "byValue", "Los Angeles");
    }

    @Then("User want to select the Hotel")
    public void user_want_to_select_the_hotel() {
       dropDown(pom.getInstanceSearchHotel().getSelectHotel(), "byVisibleText", "Hotel Creek");
    }
    @Then("User selects the Room type")
    public void user_selects_the_room_type() {
        dropDown(pom.getInstanceSearchHotel().getSelectRoomType(), "byValue", "Super Deluxe");
    }
    @Then("User select the number of Room")
    public void user_select_the_number_of_room() {
       dropDown(pom.getInstanceSearchHotel().getNoOfRooms(), "byValue", "2");
    }
    @When("User select the checkin date")
    public void user_select_the_checkin_date() {
        SendKeys(pom.getInstanceSearchHotel().getCheckIn(), "56/87/9867");
    }
    @When("User enter the checkout date")
    public void user_enter_the_checkout_date() {
        SendKeys(pom.getInstanceSearchHotel().getCheckOut(), "98/87/9867");
    }
    @Then("User select the adult per room")
    public void user_select_the_adult_per_room() {
        dropDown(pom.getInstanceSearchHotel().getAdultRoom(), "byValue", "2");
    }

    @Then("Finally User select the search button")
    public void finally_user_select_the_search_button() {
       clickOnElement(pom.getInstanceSearchHotel().getSearch());
    }
        
    @Given("User selects the Hotel")
    public void user_selects_the_hotel() {
        clickOnElement(pom.getInstanceSelectHotel().getClickButton());
    }
    @Then("User clicks continue")
    public void user_clicks_continue() {
       clickOnElement(pom.getInstanceSelectHotel().getContinue());
    }

    @Given("User enters the FirstName")
    public void user_enters_the_first_name() {
        SendKeys(pom.getInstanceBook_A_Hotel().getFirstName(), "vs");
    }
    @Then("User enters the LastName")
    public void user_enters_the_last_name() {
        SendKeys(pom.getInstanceBook_A_Hotel().getLastName(), "sv");
    }
    @Then("User enters the Billing Address")
    public void user_enters_the_billing_address(){
        SendKeys(pom.getInstanceBook_A_Hotel().getBillingAddress(), "no 123 ghahan roads, angels, chn-876985");
    }
    @When("User enter the CreditCard Number")
    public void user_enter_the_credit_card_number() throws Throwable {
      SendKeys(pom.getInstanceBook_A_Hotel().getCreditCardNo(), "657354875218");
    }
    @Then("User selects the CreditCard Type")
    public void user_selects_the_credit_card_type() {
       dropDown(pom.getInstanceBook_A_Hotel().getCreditCardType(), "byValue", "MAST");
    }
    @Then("User gives the ExpiryDate")
    public void user_gives_the_expiry_date() {
        dropDown(pom.getInstanceBook_A_Hotel().getExpiryMonth(), "byValue", "6");
        dropDown(pom.getInstanceBook_A_Hotel().getExpiryYear(), "byValue", "2018");
    }
    @Then("User enters the CVV")
    public void user_enters_the_cvv() {
        SendKeys(pom.getInstanceBook_A_Hotel().getCVV(), "786");
    }
    @Then("User clicks Book Now")
    public void user_clicks_book_now() {
        clickOnElement(pom.getInstanceBook_A_Hotel().getBookNow());
    }
    
    @Given("User logouts from the Application")
    public void user_logouts_from_the_application() {
       clickOnElement(pom.getInstanceBookingConfirmation().getLogout());
    }
}
