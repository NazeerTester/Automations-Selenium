package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAZEER\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/drop.html");
		
		WebElement From =driver.findElement(By.id("draggable"));
		WebElement To=driver.findElement(By.id("droppable"));
		
//Mouse related activities need ACTION class
		// create a object
		
		Actions actions = new Actions(driver);
		
	actions.clickAndHold(From).moveToElement(To).release(To).build().perform();
	//another way to execute above code is from drage and drop
	
	//actions.dragAndDrop(From, To).build().perform();
	
	}

}
