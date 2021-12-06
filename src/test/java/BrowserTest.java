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
	driver.get("http://google.com/");
	
	//Wait a little bit. I know that is not correct but I needed it for now. 
	//Will be removed soon
	Thread.sleep(3000);
	
	//Find the pop-up, click on it to remove it
	driver.findElement(By.id("L2AGLb")).click();
	System.out.println("I have found the button and removed it");
	
	//Find another element and send keys	
	WebElement textBox = driver.findElement(By.id("lst-ib"));
	textBox.sendKeys("Raz dwa trzy");
	
	//Little pause
	Thread.sleep(3000);
	
}
}
