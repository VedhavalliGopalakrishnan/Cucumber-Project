package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {

	public static WebDriver driver;
	
	@FindBy(name ="location")
	private WebElement SelectLocation;
	
	@FindBy(id ="hotels")
	private WebElement SelectHotel;
	
	@FindBy(id ="room_type")
	private WebElement SelectRoomType;
	
	@FindBy(name ="room_nos")
	private WebElement NoOfRooms;
	
	@FindBy(name ="datepick_in")
	private WebElement CheckIn;
	
	@FindBy(xpath ="(//input[@type='text'])[3]")
	private WebElement CheckOut;
	
	@FindBy(id ="adult_room")
    private WebElement AdultRoom;
	
	@FindBy(name ="Submit")
	private WebElement Search;
	
	public SearchHotel(WebDriver driver2) {
       this.driver = driver2;
       PageFactory.initElements(driver2, this);
		
	}

	public WebElement getSelectLocation() {
		return SelectLocation;
	}

	public WebElement getSelectHotel() {
		return SelectHotel;
	}

	public WebElement getSelectRoomType() {
		return SelectRoomType;
	}

	public WebElement getNoOfRooms() {
		return NoOfRooms;
	}

	public WebElement getCheckIn() {
		return CheckIn;
	}

	public WebElement getCheckOut() {
		return CheckOut;
	}

	public WebElement getAdultRoom() {
		return AdultRoom;
	}
	
	public WebElement getSearch() {
		return Search;
	}

}
