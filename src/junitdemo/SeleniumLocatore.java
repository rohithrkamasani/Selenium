package junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;

class SeleniumLocatore {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}
       @Disabled
		@Test
	void test0() throws Exception {
		driver.get("http://www.hyderabadreport.com/user");
		Thread.sleep(3000);
		
		driver.findElement(By.id("edit-name")).sendKeys("Rohith");
		Thread.sleep(3000);
		
		driver.findElement(By.name("pass")).sendKeys("rohith@1438");
		Thread.sleep(3000);
		
		driver.findElement(By.className("form-submit")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("edit-name")).clear();
		Thread.sleep(3000);
		
		driver.findElement(By.id("edit-name")).sendKeys("Gopi");
		Thread.sleep(3000);
		
		driver.findElement(By.id("edit-name")).clear();
		Thread.sleep(3000);
		
	//	driver.findElement(By.className("form-submit")).submit();
		Thread.sleep(3000);
		
		driver.findElement(By.id("edit-name")).sendKeys("Rohith");
		Thread.sleep(3000);
		
		driver.findElement(By.name("pass")).sendKeys("rohith@1438");
		Thread.sleep(3000);
		
		/** For Id using tag name with css selector only */
		driver.findElement(By.cssSelector("input#edit-submit")).submit();
		Thread.sleep(3000);
		
		driver.findElement(By.id("edit-name")).clear();
		Thread.sleep(3000);
		
		driver.findElement(By.id("edit-name")).sendKeys("Rohith");
		Thread.sleep(3000);
		
		driver.findElement(By.name("pass")).sendKeys("rohith@1438");
		Thread.sleep(3000);
		
		/** For Id using css selector only */
		driver.findElement(By.cssSelector("#edit-submit")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("edit-name")).clear();
		Thread.sleep(3000);
		
		driver.findElement(By.id("edit-name")).sendKeys("Rohith");
		Thread.sleep(3000);
		
		driver.findElement(By.name("pass")).sendKeys("rohith@1438");
		Thread.sleep(3000);
		
		/** For class using tag name with css selector only */
		driver.findElement(By.cssSelector("input.form-submit")).submit();
		Thread.sleep(3000);
		
		driver.findElement(By.id("edit-name")).clear();
		Thread.sleep(3000);
		
		driver.findElement(By.id("edit-name")).sendKeys("Rohith");
		Thread.sleep(3000);
		
		driver.findElement(By.name("pass")).sendKeys("rohith@1438");
		Thread.sleep(3000);
		
		/** For class using css selector only */
		driver.findElement(By.cssSelector(".form-submit")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("edit-name")).clear();
		Thread.sleep(3000);
	}
    @Disabled
	@Test
	void test1() throws Exception {
		
		driver.get("http://www.hyderabadreport.com/user");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Telangana")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Photos")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Andhra ")).click();
		Thread.sleep(3000);
		
	}
     
      @Test
      void test2() throws InterruptedException {
    	 driver.get("https://www.ndtv.com");
    	 Thread.sleep(3000);
    	 
    	 List<WebElement> images = driver.findElements(By.tagName("img"));
    	 
    	 System.out.println("Total Images on NDTV Website:"+images.size());
    	 
    	  
      }
      @Ignore
      @Test
      void test3() throws InterruptedException {
    	  driver.get("http://www.hyderabadreport.com/user");
    	  Thread.sleep(3000);
    	  driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("Rohith");
    	  Thread.sleep(3000);
    	  
    	  driver.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys("rkreddy");
    	  Thread.sleep(3000);
    	  
    	  driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).click();
    	  Thread.sleep(3000);
    	  
      }
}
