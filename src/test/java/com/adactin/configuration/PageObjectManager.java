package com.adactin.configuration;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.LoginPage;
import com.adactin.pom.Book_A_Hotel;
import com.adactin.pom.BookingConfirmation;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;

public class PageObjectManager {

	
	public static WebDriver driver;
	
	private LoginPage lp;
	private SearchHotel sh;
	private SelectHotel shl;
	private Book_A_Hotel bh;
	private BookingConfirmation bc;
	
	public PageObjectManager(WebDriver driver2) {
       this.driver =driver2;
	}
	
	public LoginPage getInstanceLoginPage() {
        lp = new LoginPage(driver);
        return lp;
	}
	
	public SearchHotel getInstanceSearchHotel() {
         sh = new SearchHotel(driver);
         return sh;
	}
	
	public SelectHotel getInstanceSelectHotel() {
         shl = new SelectHotel(driver);
         return shl;
	}
	
	public Book_A_Hotel getInstanceBook_A_Hotel() {
         bh = new Book_A_Hotel(driver);
         return bh;
	}
	
	public BookingConfirmation getInstanceBookingConfirmation() {
         bc = new BookingConfirmation(driver);
         return bc;		 
	}
}
