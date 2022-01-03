package Selenium;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAZEER\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/frame.html");


		driver.switchTo().frame(0);
		WebElement button1=driver.findElement(By.id("Click"));
		button1.click();


		String clicks= driver.findElement(By.id("Click")).getText();
		System.out.println(clicks);

		//Default content used to bringback the windows to default on FRAMES

		driver.switchTo().defaultContent();

		//Nested frame clicking button
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");

		WebElement button2=driver.findElement(By.id("Click1"));
		button2.click();

		//finding total number of frames
		driver.switchTo().defaultContent();

		//below used findElements becz we are counting multiple elements
		List<WebElement> totalframes=driver.findElements(By.tagName("iframe"));//tag name count no of tags
		int size=totalframes.size();
		System.out.println(size);
	}

}
