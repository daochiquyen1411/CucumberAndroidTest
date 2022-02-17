package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.AuthenticationPage;

public class ShoppingCartSummaryPage extends BasePage{

	public ShoppingCartSummaryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
    private WebElement btnProcceedToCheckout = keyword.findElement(By.cssSelector(".standard-checkout"));

    public AuthenticationPage proceedToCheckout(){
        keyword.click(btnProcceedToCheckout);
        return new AuthenticationPage(this.driver);
    }
}
