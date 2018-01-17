package tracko.product.Tracko;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.converters.ExtentHtmlReporterConverter;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class SetupBrowser {

	WebDriver driver;

	@Test
	public void runall() throws InterruptedException {

		// try {

		SignUp up = new SignUp(driver);
		up.signup();

		// } catch (Exception e) {

		// }

		// try {

		SignIn sign = new SignIn(driver);
		sign.signin();

		// } catch (Exception e) {

		// }

		//
		// AddProduct add=new AddProduct(driver);
		// add.addproduct();
		//
		// OpenCart open=new OpenCart(driver);
		// open.cart();
		//
		// Address ress=new Address(driver);
		// ress.address();
		//
	}

	@BeforeTest
	// public void beforeTest() throws InterruptedException {
	// DesiredCapabilities capabilities= new DesiredCapabilities();
	// capabilities.setBrowserName("chrome");
	//
	//
	//
	// try {
	// driver = new RemoteWebDriver(new URL("http://192.168.0.4:4444/wd/hub"),
	// capabilities) ;
	// } catch (MalformedURLException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// driver.get("https://dev.tracko.co.in/");
	// driver.manage().window().maximize();
	// Thread.sleep(5000);
	// }
	public void beforetest() {

		System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://dev.tracko.co.in/");
		driver.manage().window().maximize();

	}

	@AfterTest
	public void afterTest() {

		driver.findElement(By.className("dropdown-toggle")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.xpath("//a[@onclick='logout();']")).click();
		driver.quit();
	}

}
