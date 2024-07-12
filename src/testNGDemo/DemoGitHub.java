package testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class DemoGitHub {
  WebDriver driver;
  @Test
  public void google() {
    driver.get("https://www.google.com");
  }
  @BeforeTest
  public void beforeTest() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
  }

}
