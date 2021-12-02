import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) {
	
	String projectPath = System.getProperty("user.dir");
	System.out.println(projectPath);
	System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.onet.pl");
	}
	
}
