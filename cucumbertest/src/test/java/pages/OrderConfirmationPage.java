package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderConfirmationPage extends BasePage{

	public OrderConfirmationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

    private WebElement lblSuccessMessage = keyword.findElement(By.cssSelector(".alert-success"));

    public String getSuccessMessage(){
        return lblSuccessMessage.getText();
    }	
}
