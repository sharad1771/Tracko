package tracko.product.Tracko;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class AddProduct {
	WebDriver driver;
	
  public AddProduct(WebDriver driver2) {
		driver=driver2;
	}
@Test
  public void addproduct() {
	  
	//  driver.findElement(By.xpath("//a[@href='trackoweb/products.html']")).click();
	  driver.findElement(By.xpath("//a[@href='product_details.html?modelId=1'][@class='btn btn-sm btn-block btn-cta-primary']")).click();
	  driver.findElement(By.xpath("//a[@onclick='orderProduct();']")).click();
	  driver.findElement(By.xpath("//a[@data-id='7']")).click();
	  driver.findElement(By.id("qtyDevice")).sendKeys("3");
	  driver.findElement(By.xpath("//button[@class='btn btn-primary mb-5']")).click();
	  driver.findElement(By.id("vehicletextbox")).sendKeys("dl1002");
	  driver.findElement(By.cssSelector("button[style='width: 250px;']")).click();
		 
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
