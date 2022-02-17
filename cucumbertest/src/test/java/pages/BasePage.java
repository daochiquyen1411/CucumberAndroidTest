package pages;

import org.openqa.selenium.WebDriver;

import keyword.WebKeyword;

public class BasePage {
	public WebDriver driver;
	public WebKeyword keyword;
	
	public BasePage(WebDriver driver) {
		super();
		this.driver = driver;
		this.keyword = new WebKeyword(driver);
	}
	
	
}
