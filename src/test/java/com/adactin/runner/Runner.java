package com.adactin.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.configuration.File_Reader_Manager;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature" , glue = "com\\adactin\\stepdefinition" , 
 plugin = { "pretty" }  , monochrome = true )

public class Runner {
	
	public static WebDriver driver;
	 
	@BeforeClass
	public static void set_up() throws Throwable {
		String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();
     driver = BaseClass.getBrowser(browser);
	}
}
