package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.OrderConfirmationPage;

public class OrderSummaryPage extends BasePage{

	public OrderSummaryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

    private WebElement btnConfirm = keyword.findElement(By.xpath("//*[contains(@class,'cart_navigation')]//button[@type='submit']"));

    public OrderConfirmationPage confirmOrder(){
        keyword.click(btnConfirm);
        return new OrderConfirmationPage(this.driver);
    }
}
