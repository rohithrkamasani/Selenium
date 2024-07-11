package junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

class DemoJunit {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Test
	void google() {
		driver.get("https://www.google.com");
		
	
	}
	
	@Test
	void facebook() {
		driver.get("https://www.facebook.com");
	}
	
	@Test
	void gmail() {
		driver.get("https://www.gmail.com");
	}
	
	@Test
	void twitter() {
		driver.get("https://www.x.com");
	}
	@Ignore // This is only for Junit 3 & 4 only
	@Test
	void selenium() {
		driver.get("https://selenium.dev");
	
	}
	
	@Disabled
	@Test
	void redmine() {
		driver.get("https://www.redmine.org");
		
	}

}
