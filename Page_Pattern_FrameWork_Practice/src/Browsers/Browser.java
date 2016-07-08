package Browsers;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	public static WebDriver Webdriver;

	public static void open() {
		Webdriver=new FirefoxDriver();
		Webdriver.manage().window().maximize();
		
	}

	public static void close() {
		Webdriver.quit();
		
	}
	
	public static WebDriver Driver(){
		return Webdriver;
	}
	
	
	

}
