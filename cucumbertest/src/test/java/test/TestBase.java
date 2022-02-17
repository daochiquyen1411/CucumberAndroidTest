package test;

import org.openqa.selenium.WebDriver;

import driver.DriverFactory;

import configuration.Configuration;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import keyword.WebKeyword;

public class TestBase {
	 public WebDriver driver;
	 public WebKeyword keyword;
	 public Configuration config;
	    
	
//	 @After
//	 public void tearDown(){
//	    this.driver.quit();
//	 }	   
}
