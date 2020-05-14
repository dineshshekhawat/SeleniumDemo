import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
		// Selenium Code
		
		// Create a Driver Object for Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/home/dinesh/software/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// Create a Driver Object for Firefox Browser
//		System.setProperty("webdriver.gecko.driver", "/home/dinesh/software/geckodriver");
//		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.co.in");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
		
		driver.get("http://yahoo.com");
		
		driver.navigate().back();
		driver.navigate().forward();
		
//		driver.close();
		driver.quit();
	}

}
