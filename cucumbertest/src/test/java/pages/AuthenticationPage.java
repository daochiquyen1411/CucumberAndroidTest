package pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.CreateAccountPage;

public class AuthenticationPage extends BasePage{

	public AuthenticationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
    private WebElement txtEmail = keyword.findElement(By.id("email_create"));
    private WebElement btnCreateAccount = keyword.findElement(By.id("SubmitCreate"));

    public CreateAccountPage createNewAccount(){
        Random rand = new Random();
        int int_random = rand.nextInt(100);
        keyword.setText(txtEmail, String.format("daochiquyen%s@gmail.com", String.valueOf(int_random)));
        keyword.click(btnCreateAccount);
        return new CreateAccountPage(this.driver);
    }
}
