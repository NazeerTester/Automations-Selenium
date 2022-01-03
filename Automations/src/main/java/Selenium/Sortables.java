package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAZEER\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/sortable.html");
		
		List<WebElement> elements=driver.findElements(By.xpath("//*[@id=\'sortable\']/li"));
		
		 WebElement fromElement=elements.get(6);
		 WebElement toElement=elements.get(0);
		 
		 Actions actions=new Actions(driver);
		 
		 actions.clickAndHold(fromElement);
		 actions.moveToElement(toElement);
		 actions.moveToElement(toElement);
		 actions.build().perform();
				
	}

}
