package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearchTest();
	}
	
	public static void googleSearchTest() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		
		//start test
		driver.get("https://google.com");
		//Wait
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		searchPageObj.removeThatPopUp();
		searchPageObj.setTextInSearchBox("A B C D");
		searchPageObj.clickSearchButton();
		driver.close();
		driver.quit();
	}	
}
