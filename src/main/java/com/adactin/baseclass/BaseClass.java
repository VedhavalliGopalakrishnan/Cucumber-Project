package com.adactin.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;

	public static WebDriver getBrowser(String browser) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
			   System.setProperty("webdriver.chrome.driver", 
					   System.getProperty("user.dir") + ("\\Driver\\chromedriver.exe"));
			   driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", 
						System.getProperty("user.dir") + ("\\Driver\\firefoxdriver.exe"));
				driver = new FirefoxDriver();
			}else if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", 
						System.getProperty("user.dir") + ("\\Driver\\edgedriver.exe"));
				driver = new EdgeDriver();
			}else {
				System.out.println("Invalid browser");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
        }
//////	
         public static void getUrl(String url) {
          try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
//////         
         public static void SendKeys(WebElement element, String value) {
          try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
//////         
         public static void clickOnElement(WebElement element) {
          try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
//////         
         public static void dropDown(WebElement element, String Options, String value) {
        	 
          try {
			Select s = new Select(element);
			  
				if (Options.equalsIgnoreCase("byIndex")) {
					int parseInt = Integer.parseInt(value);
					s.selectByIndex(parseInt);
				}else if (Options.equalsIgnoreCase("byValue")) {
					s.selectByValue(value);
				}else if (Options.equalsIgnoreCase("byVisibleText")) {
					s.selectByVisibleText(value);
				}else {
					System.out.println("Invalid Selection");
				}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	} 
///////         
         public static void close() {
          try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
///////
         public static void quit() {

        	 try {
				driver.quit();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
////////
        public static void navigateTo(String url) {

				try {
					driver.navigate().to(url);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} 
/////////        
        public static void navigateBack() {

        	try {
				driver.navigate().back();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
/////////
        public static void navigateForward() {

        	try {
				driver.navigate().forward();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
////////
        public static void navigateRefresh() {

        	try {
				driver.navigate().refresh();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
////////
        public static void getCurrentUrl() {

        	try {
				String currentUrl = driver.getCurrentUrl();
				System.out.println("Current url :" + currentUrl);
			} catch (Exception e) {
				e.printStackTrace();
			}
        	
		}
////////
        public static void getTitle() {
     
        	try {
				String title = driver.getTitle();
				System.out.println("Title of this page :" + title);
        		} catch (Exception e) {
				e.printStackTrace();
			}
		}
///////
        public static void takeScreenShot() throws Throwable {
		
    	  try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			  File source = ts.getScreenshotAs(OutputType.FILE);
			  File target = new File("C:\\Users\\Admin\\eclipse-workspace\\Cucumber\\Screenshots");                                ////////////////////////////////////////////
			  FileUtils.copyFileToDirectory(source, target);
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
      }
///////
        public static void isEnable(WebElement element) {

        	try {
				if (element.equals(element)) {
					boolean enabled = element.isEnabled();
					System.out.println("Enabled or not :" + enabled);
				} else {
					System.out.println("Invalid Element");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
///////        
       public static void isSelected(WebElement element ) {
    	   
    	   try {
			if (element.equals(element)) {
				boolean selected = element.isSelected();
				System.out.println("Selected or not :" + selected);
			} else {
			    System.out.println("Invalid selection");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
////////
       public static void isDisplayed(WebElement element) {

          
    	   if (element.equals(element)) {
			  boolean displayed = element.isDisplayed();
			  System.out.println("Displayed or not :" + displayed);
		} else {
            System.out.println("Not Displayed");
		}
	}
////////
       public static void giveWait(Integer i) {
    	   
    	   try {
			driver.manage().timeouts().implicitlyWait(i , TimeUnit.SECONDS);        /////////////////////////////////////
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
       
       public static void moveToElement(WebElement element) {
        
    	   try {
			Actions ac = new Actions(driver);
		
				ac.moveToElement(element).build().perform();
			  
		} catch (Exception e) {
			e.printStackTrace();
		}
    	   
    	   
	}
       public static void scrollUpDown(WebElement element) {

    	   JavascriptExecutor js = (JavascriptExecutor) driver;
    	   js.executeScript("arguments[0].scrollIntoView();", element);
    	  
	}
      
}


