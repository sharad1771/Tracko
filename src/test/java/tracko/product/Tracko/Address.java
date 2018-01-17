package tracko.product.Tracko;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Address {
	
	WebDriver driver;
	String billname="rocky";
	String billaddress="karve nagar";
	String billcity="pune";
	String billpincode="rocky";

	
  public Address(WebDriver driver2) {
		driver=driver2;
	}
@Test
  public void address() throws InterruptedException {
	  driver.findElement(By.className("input[type='checkbox']")).click();
	  driver.findElement(By.id("billingName")).sendKeys("billname");
	  driver.findElement(By.id("billingStreet")).sendKeys("billaddress");
	  driver.findElement(By.id("billingCity")).sendKeys("billcity");
	  
	  Select oselect =new Select(driver.findElement(By.id("billingCity")));
	  oselect.selectByIndex(1);
	  
	  driver.findElement(By.id("billingPincode")).sendKeys("billpincode");
	  driver.findElement(By.cssSelector("button[onclick='saveOrder();']")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//button[text()='Yes, proceed it!']")).click();
	  driver.findElement(By.xpath("//a[@class='primary-button primary-button-bg primary-button-border cancel']")).click();
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
