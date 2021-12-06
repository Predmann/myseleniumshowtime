package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {
	
	public static void main(String[] args) {
		googleSearch();
		
	}
	
	public static void googleSearch() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
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
		driver.findElement(By.className("gNO89b")).sendKeys(Keys.ENTER);
		System.out.println("Button is clicked");
		
		//close browser
		driver.close();
		System.out.println("Closing...");
		
		System.out.println("Test is now completed successfully");
	}
}
