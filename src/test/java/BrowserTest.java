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
	
	driver.get("http://google.com/");
	WebElement textBox = driver.findElement(By.id("lst-ib"));
	textBox.sendKeys("Raz dwa trzy");
	
	Thread.sleep(3000);
	
}
}
