package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.ProductDetailPage;

public class WomenPage extends BasePage{

	public WomenPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public ProductDetailPage selectProduct(){
        keyword.click(keyword.findElement(By.xpath("//a[@title = 'Blouse' and @class = 'product-name']")));
        return new ProductDetailPage(this.driver);
    }
}
