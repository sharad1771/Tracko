package tracko.product.Tracko;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class SignUp {

	WebDriver driver;

	String username = "almaaa";
	String email = "almaaa@gmail.com";
	String mobilenumber = "9765431010";
	String password = "qwerty34";
	String repassword = "qwerty34";
	String otp = "123456";

	@FindBy(xpath = "//a[text()='Sign Up Free']")
	WebElement webofSignUpFreeButton;

	@FindBy(id = "name")
	WebElement webofusername;

	@FindBy(id = "email")
	WebElement webofemail;

	@FindBy(id = "mobile")
	WebElement webofmobile;

	@FindBy(id = "sub_btn_signup")
	WebElement webofsignupbtn;

	@FindBy(id = "otp")
	WebElement webofotp;

	@FindBy(id = "sub_btn_verify")
	WebElement webofverifybtn;

	@FindBy(xpath = "//button[text()='OK']")
	WebElement webofOk;

	@FindBy(id = "password")
	WebElement webofPassword;

	@FindBy(id = "repassword")
	WebElement webofrepassword;

	@FindBy(xpath = "//button[text()='Set password & procceed to login>>']")
	WebElement webofSetPassLogin;

	public SignUp(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@Test
	public void signup() throws InterruptedException {

		webofSignUpFreeButton.click();
		webofusername.sendKeys(username);
		webofemail.sendKeys(email);
		webofmobile.sendKeys(mobilenumber);
		webofsignupbtn.click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		webofotp.sendKeys(otp);// otp field
		webofverifybtn.click();

		Thread.sleep(5000);
		webofOk.click();

		webofPassword.sendKeys(password);
		webofrepassword.sendKeys(repassword);
		webofSetPassLogin.click();

	}

	@BeforeTest
	public void beforeTest() {

	}

	@AfterTest
	public void afterTest() {

	}

}
