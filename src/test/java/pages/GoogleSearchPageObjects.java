package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	
	WebDriver driver = null;

	By popup_button = By.id("L2AGLb");
	By textbox_search_ = By.name("q");
	By button_search_ = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]");
	//By button_search_ = By.name("btnK");
	
	public GoogleSearchPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	//Find the pop-up, click on it to remove it
	
	public void removeThatPopUp() {
		driver.findElement(popup_button).click();
	}
			
	
	public void setTextInSearchBox(String text) {
		driver.findElement(textbox_search_).sendKeys("text");
	}
	
	public void clickSearchButton() {
		driver.findElement(button_search_).sendKeys(Keys.ENTER);
		
	}
}
