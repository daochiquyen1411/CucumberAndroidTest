package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import keyword.SelectType;
import pages.AddressPage;

public class CreateAccountPage extends BasePage{

	public CreateAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
    private WebElement radMr ;
//    = keyword.findElement(By.id("id_gender1"));
    private WebElement txtFirstName;
//    = keyword.findElement(By.id("customer_firstname"));
    private WebElement txtLastName;
//    = keyword.findElement(By.id("customer_lastname"));
    private WebElement txtPassword;
//    = keyword.findElement(By.id("passwd"));
    private WebElement txtYourAddressFirstName ;
//    = keyword.findElement(By.id("firstname"));
    private WebElement txtYourAddressLastName ;
//    = keyword.findElement(By.id("lastname"));
    private WebElement txtYourAddressCompany ;
//    = keyword.findElement(By.id("company"));
    private WebElement txtYourAddress; 
//    = keyword.findElement(By.id("address1"));
    private WebElement txtYourAddressCity;
//    = keyword.findElement(By.id("city"));    
    private WebElement selYourAddressState ;
//    = driver.findElement(By.id("id_state"));
    private WebElement txtYourAddressZipcode ;
//    = keyword.findElement(By.id("postcode"));
    private WebElement selYourAddressCountry ;
//    = keyword.findElement(By.xpath("//select[@id='id_country']"));
    private WebElement txtYourAddressMobilePhone ;
//    = keyword.findElement(By.id("phone_mobile"));
    private WebElement btnRegister ;
//    = keyword.findElement(By.id("submitAccount"));


    public AddressPage createNewAccount() throws Exception {
    	radMr = keyword.findElement(By.id("id_gender1"));
    	keyword.click(radMr);
    	
    	txtFirstName = keyword.findElement(By.id("customer_firstname"));
        keyword.setText(txtFirstName, "Dao");
        
        txtLastName = keyword.findElement(By.id("customer_lastname"));
        keyword.setText(txtLastName, "Quyen");
        
        txtPassword = keyword.findElement(By.id("passwd"));
        keyword.setText(txtPassword, "123456789");
        
        txtYourAddressFirstName = keyword.findElement(By.id("firstname"));
        keyword.setText(txtYourAddressFirstName, "Dao");
        
        txtYourAddressLastName = keyword.findElement(By.id("lastname"));
        keyword.setText(txtYourAddressLastName, "Quyen");
        
        txtYourAddressCompany = keyword.findElement(By.id("company"));
        keyword.setText(txtYourAddressCompany,"fpt");
        
        txtYourAddress = keyword.findElement(By.id("address1"));
        keyword.setText(txtYourAddress, "385 Nguyen Trai");
        
        txtYourAddressCity = keyword.findElement(By.id("city")); 
        keyword.setText(txtYourAddressCity, "HCM");
        
        selYourAddressState = driver.findElement(By.id("id_state"));
        keyword.select(selYourAddressState, SelectType.SELECT_BY_VALUE, "2");
        
        txtYourAddressZipcode = keyword.findElement(By.id("postcode"));
        keyword.setText(txtYourAddressZipcode, "70000");
        
        txtYourAddressMobilePhone = keyword.findElement(By.id("phone_mobile"));
        keyword.setText(txtYourAddressMobilePhone, "0966834771");
        
        btnRegister = keyword.findElement(By.id("submitAccount"));   	
        keyword.click(btnRegister);
        return new AddressPage(this.driver);
    }
}
