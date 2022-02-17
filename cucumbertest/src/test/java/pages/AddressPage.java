package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.ShippingPage;

public class AddressPage extends BasePage{

	public AddressPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

    private WebElement btnProceedToCheckout = keyword.findElement(By.xpath("//*[@name='processAddress']"));

    public ShippingPage proceedToCheckout(){
        keyword.click(btnProceedToCheckout);
        return new ShippingPage(this.driver);
    }	
}
