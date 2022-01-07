package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class TestNG_Demo {
	WebDriver driver = null;
	public static String browserName = null;


	@BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		PropertiesFile.getProperties();

		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver/firefoxdriver.exe");
			driver = new FirefoxDriver();
		}
	}
	@Test
	public void googleSearch() {



		//navigate to google.com
		driver.get("https://www.google.com/");

		//Wait
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		//Find the pop-up, click on it to remove it
		driver.findElement(By.id("L2AGLb")).click();
		System.out.println("I have found the button and removed it");

		//Wait
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		//enter text to the textbox for search
		driver.findElement(By.name("q")).sendKeys("Onet");
		System.out.println("Provided send Keys");

		//Wait
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		//find search button and click it 
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.ENTER);
		System.out.println("Button is clicked");

	}
	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Closing...");

		System.out.println("Test is now completed successfully");

	}
}
