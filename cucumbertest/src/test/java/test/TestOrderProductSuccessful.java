package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;


import pages.AddressPage;
import pages.AuthenticationPage;
import pages.CreateAccountPage;
import pages.MainPage;
import pages.OrderConfirmationPage;
import pages.OrderSummaryPage;
import pages.PaymentPage;
import pages.ProductDetailPage;
import pages.ShippingPage;
import pages.ShoppingCartSummaryPage;
import pages.WomenPage;
import configuration.Configuration;
import driver.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import keyword.WebKeyword;

public class TestOrderProductSuccessful extends TestBase{

	@Given("user is on main page")
	public void setUp() throws Exception {
	   WebDriverManager.chromedriver().setup();
	   this.config = new Configuration("src/test/resources/automationpractise/config.properties");
	   this.driver = DriverFactory.getDriver(config.getProperty("browser"));
	   this.keyword = new WebKeyword(driver);
	   keyword.openUrl(config.getProperty("url"));
	}
	 
	@And("user click on women page button")
	public void user_click_on_women_page_button() {
		MainPage mainPage = new MainPage(this.driver);
		mainPage.toWomenPage();
		
	}

	@And("user click on product and navigate to product detail page")
	public void user_click_on_product() {
		WomenPage womenPage = new WomenPage(this.driver);
		womenPage.selectProduct();
	}

	@And("user add product to cash and navigate to shopping cart summary page")
	public void user_check_out_product() {
		ProductDetailPage productDetailPage = new ProductDetailPage(this.driver);
		productDetailPage.addProductToCart();
		productDetailPage.proceedToCheckout();
	}
	
	@And("user click process to checkout and navigate to authentication page")
	public void cart_summary_page_user_click_check_out_product() {
		ShoppingCartSummaryPage shoppingCartSummaryPage = new ShoppingCartSummaryPage(this.driver);
		shoppingCartSummaryPage.proceedToCheckout();
	}
	
	@And("user fill email infomation and click on create account button then navigate to create account page")
	public void authentication_page_user_click_create_new_account() {
		AuthenticationPage authenticationPage = new AuthenticationPage(this.driver);
		authenticationPage.createNewAccount();
	}
	
	@And("user fill information and create account then navigate to addresss page")
	public void user_click_create_new_user_account() throws Exception {
		CreateAccountPage createAccountPage = new CreateAccountPage(this.driver);
		createAccountPage.createNewAccount();
	}
	
	@And("user process to checkout and navigate to shipping page")
	public void address_page_user_click_process_to_checkout() {
		AddressPage addressPage = new AddressPage(this.driver);
		addressPage.proceedToCheckout();
	}
	
	@And("user process to checkout and navigate to payment page")
	public void shipping_page_user_click_process_to_checkout() {
		ShippingPage shippingPage = new ShippingPage(this.driver);
		shippingPage.proceedToCheckout();
	}
	
	@And("user click on pay by check and navigate to order summary page")
	public void payment_page_user_click_pay_by_check() {
		PaymentPage paymentPage = new PaymentPage(this.driver);
		paymentPage.payByCheck();
	} 
	
	@And("User click on confirm button and navigate to order confirmation page")
	public void order_summary_page_user_click_confirm() {
		OrderSummaryPage orderSummaryPage = new OrderSummaryPage(this.driver);
		orderSummaryPage.confirmOrder();
	}
		
	@Then("user will see completed message")
	public void user_finish() {
//		this.driver.quit();
		OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage(this.driver);
		String actualSuccessMessage = orderConfirmationPage.getSuccessMessage();
		String expectedSuccessMessage = "Your order on My Store is complete.";
		junit.framework.Assert.assertEquals(actualSuccessMessage, expectedSuccessMessage);
	}
}
