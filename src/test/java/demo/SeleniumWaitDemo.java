package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitDemo {
	
	public static void main(String[] args) {
		seleniumWaits();
		
	}

		public static void seleniumWaits() {
			
			String projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			//250 ms by default
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			By popup_button = By.id("L2AGLb");
			driver.get("https://google.com");
			driver.findElement(popup_button).click();
			driver.findElement(By.name("q")).sendKeys("Text");
			//driver.findElement(By.name("btnK"[2])).sendKeys(Keys.RETURN);
			driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).sendKeys(Keys.RETURN);
			
			WebDriverWait wait = new WebDriverWait(driver, 20);
			
			//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));
			
			
			driver.close();
			driver.quit();
		}
}
