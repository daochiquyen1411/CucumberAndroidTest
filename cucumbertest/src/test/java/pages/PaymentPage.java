package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.OrderSummaryPage;

public class PaymentPage extends BasePage{

	public PaymentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

    private WebElement btnPayByCheck = keyword.findElement(By.className("cheque"));

    public OrderSummaryPage payByCheck(){
        keyword.click(btnPayByCheck);
        return new OrderSummaryPage(this.driver);
    }
}
