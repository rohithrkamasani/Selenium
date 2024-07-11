package javademo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowserInSelenium {

	 static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new FirefoxDriver();
		
		/*WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();*/
	}
	
}
