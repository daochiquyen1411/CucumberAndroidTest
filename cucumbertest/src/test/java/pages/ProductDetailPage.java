package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.ShoppingCartSummaryPage;
import pages.ProductDetailPage;

public class ProductDetailPage extends BasePage{

	public ProductDetailPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
    private WebElement btnAddToCart = keyword.findElement(By.cssSelector("#add_to_cart"));

    public ProductDetailPage addProductToCart(){
        keyword.click(btnAddToCart);
        return this;
    }

    public ShoppingCartSummaryPage proceedToCheckout(){
        keyword.click(keyword.findElement(By.xpath("//*[@title= 'Proceed to checkout']")));
        return new ShoppingCartSummaryPage(this.driver);
    }

}
