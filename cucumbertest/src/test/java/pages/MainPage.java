package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.WomenPage;

public class MainPage extends BasePage{

	public MainPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private WebElement tabWomen= keyword.findElement(By.xpath("//*[contains(@class, 'menu-content')]/li/a[@title= 'Women']"));
	
	public WomenPage toWomenPage(){
        keyword.click(tabWomen);
        return new WomenPage(this.driver);
    }
}
