package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAZEER\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/tooltip.html");
		
		
		//For tool tip - to retrieve the web element we need to get title attribute
		WebElement name=driver.findElement(By.id("age"));
		String Tooltiptext =name.getAttribute("title");
		System.out.println(Tooltiptext);
	}

}
