package tracko.product.Tracko;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class OpenCart {
	
	WebDriver driver;
  public OpenCart(WebDriver driver2) {
	  driver=driver2;
		// TODO Auto-generated constructor stub
	}
@Test
  public void cart() {
	  driver.findElement(By.cssSelector("a[href='/trackoweb/productCart.html']")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
