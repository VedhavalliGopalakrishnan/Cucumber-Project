package com.adactin.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public static WebDriver driver;
	
	@FindBy(id ="username")
	private WebElement ourname;
	
	@FindBy(name ="password")
	private WebElement ourpass;
	
	@FindBy(xpath ="//input[@type='Submit']")
	private WebElement Login;
	
	public LoginPage(WebDriver driver2) {
	     this.driver = driver2;
	     PageFactory.initElements(driver2, this);
		}


	public WebElement getOurname() {
		return ourname;
	}

	public WebElement getOurpass() {
		return ourpass;
	}

	public WebElement getLogin() {
		return Login;
	}
	
	}
