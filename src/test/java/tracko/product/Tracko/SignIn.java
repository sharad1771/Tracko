package tracko.product.Tracko;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class SignIn {

	WebDriver driver;

	String mobilenumber = "1000160006";
	String password = "qwerty34";

	@FindBy(id = "login-mobile")
	WebElement webofLoginMoble;

	@FindBy(id = "login-password")
	WebElement webofLoginPassword;

	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement webofcheckbox;

	@FindBy(id = "sub_btn")
	WebElement webofSubBtn;

	public SignIn(WebDriver driver2) {
		this.driver = driver;
		PageFactory.initElements(driver2, this);
	}

	@Test
	public void signin() throws InterruptedException {

		webofLoginMoble.sendKeys(mobilenumber);
		webofLoginPassword.sendKeys(password);
		webofcheckbox.click();
		webofSubBtn.click();

		Thread.sleep(3000);

	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

}
