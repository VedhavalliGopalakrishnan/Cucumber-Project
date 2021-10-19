package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_A_Hotel {

	public WebDriver driver;
	
	@FindBy(name ="first_name")
	private WebElement FirstName;
	
	@FindBy(name ="last_name")
	private WebElement LastName;
	
	@FindBy(id ="address")
	private WebElement BillingAddress;
	
	@FindBy(name ="cc_num")
	private WebElement CreditCardNo;
	
	@FindBy(id ="cc_type")
	private WebElement CreditCardType;
	
	@FindBy(id ="cc_exp_month")
	private WebElement ExpiryMonth;
	
    @FindBy(name ="cc_exp_year")
    private WebElement ExpiryYear;
    
    @FindBy(xpath ="(//input[@class='reg_input'])[4]")
    private WebElement CVV;
    
    @FindBy(id ="book_now")
    private WebElement BookNow;
    
    public Book_A_Hotel(WebDriver driver2) {
    	this.driver = driver2;
    	PageFactory.initElements(driver2, this);
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getBillingAddress() {
		return BillingAddress;
	}

	public WebElement getCreditCardNo() {
		return CreditCardNo;
	}

	public WebElement getCreditCardType() {
		return CreditCardType;
	}

	public WebElement getExpiryMonth() {
		return ExpiryMonth;
	}

	public WebElement getExpiryYear() {
		return ExpiryYear;
	}

	public WebElement getCVV() {
		return CVV;
	}

	public WebElement getBookNow() {
		return BookNow;
	}
    
    
}
