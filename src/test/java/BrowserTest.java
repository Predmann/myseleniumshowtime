import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {
	
	String projectPath = System.getProperty("user.dir");
	System.out.println(projectPath);
	
	// System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver/geckodriver.exe");
	System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
	
	//WebDriver driver = new FirefoxDriver();
	WebDriver driver = new ChromeDriver();
		
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
}
