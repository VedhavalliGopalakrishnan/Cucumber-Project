package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation {
	
	public static WebDriver driver;
	
	@FindBy(xpath ="//a[text()='Logout']")
	private WebElement Logout;

	public BookingConfirmation(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getLogout() {
		return Logout;
	}

}
