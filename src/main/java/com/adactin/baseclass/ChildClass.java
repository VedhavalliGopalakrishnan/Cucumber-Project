package com.adactin.baseclass;

import org.openqa.selenium.By;

public class ChildClass extends BaseClass {
	
	public static void main(String[] args) throws Throwable  {
		
		getBrowser("chrome");
		getUrl("https://www.facebook.com/");
		isEnable(driver.findElement(By.id("email")));
		isSelected(driver.findElement(By.id("email")));
		isDisplayed(driver.findElement(By.name("login")));
		getCurrentUrl();
		getTitle();
		navigateBack();
		giveWait(8);
		navigateForward();
		navigateTo("https://www.amazon.in/");
		moveToElement(driver.findElement(By.xpath("//a[text()='Mobiles']")));
		Thread.sleep(3000);
		scrollUpDown(driver.findElement(By.xpath("(//a[text()='See all deals'])[1]")));
		navigateTo("https://www.nykaa.com/");
		moveToElement(driver.findElement(By.xpath("//a[text()='categories']")));
		moveToElement(driver.findElement(By.xpath("//a[text()='Health & Wellness']")));
		clickOnElement(driver.findElement(By.xpath("//a[text()='Multivitamins']")));
		clickOnElement(driver.findElement(By.xpath("//*[@id=\"product-list-wrap\"]/div[1]/div/div[2]/div/button[2]/span")));
	}

}
