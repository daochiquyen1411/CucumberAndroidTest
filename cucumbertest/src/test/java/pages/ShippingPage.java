package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.PaymentPage;

public class ShippingPage extends BasePage{

	public ShippingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

    private WebElement btnProceedToCheckout = keyword.findElement(By.xpath("//*[@name='processCarrier']"));
    private WebElement checkAgree = driver.findElement(By.id("uniform-cgv"));

    public PaymentPage proceedToCheckout(){
        keyword.click(checkAgree);
        keyword.click(btnProceedToCheckout);
        return new PaymentPage(this.driver);
    }	
}
