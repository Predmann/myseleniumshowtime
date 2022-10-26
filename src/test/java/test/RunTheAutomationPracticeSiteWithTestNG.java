package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class RunTheAutomationPracticeSiteWithTestNG {
	WebDriver driver = null;
	//here set which browser would you like to use: Chrome or Firefox?
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
	public void startAutomationPractice() throws InterruptedException {

		//Navigate to wanted page
		driver.get("http://automationpractice.com/index.php");
		
		//Wait a little bit. I know that is not correct but I needed it for now. 
		//Will be removed soon due to using implicityWaits
		Thread.sleep(3000);
		
		//Find textBox and searchButton	
		WebElement textBox = driver.findElement(By.id("search_query_top"));
		WebElement searchButton = driver.findElement(By.name("submit_search"));
		
		//Type the text on the textBox and click on the searchButton
		textBox.sendKeys("faded");
		searchButton.click();
				
		//Little pause
		Thread.sleep(3000);
		System.out.println("done");

	}
	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Closing...");
		System.out.println("Test is now completed successfully");

	}
}
