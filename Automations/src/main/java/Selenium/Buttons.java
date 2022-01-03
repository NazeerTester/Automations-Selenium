package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAZEER\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Button.html");
		
		//1, get the xy position
		
		WebElement getpositionButton = driver.findElement(By.id("position"));
		Point xypoint = getpositionButton.getLocation();
		int xValue =xypoint.getX();
		int yValue = xypoint.getY();
		System.out.println("X value is" + xValue + "Y value is" + yValue);
		
		
		//2.find the color
		WebElement colorbutton = driver.findElement(By.id("color"));
		
		String color =colorbutton.getCssValue("background-color");
		
		System.out.println("Button color is" + color);
		
		//3.find the size
		
		WebElement sizebutton = driver.findElement(By.id("size"));
		int height = sizebutton.getSize().getHeight();
		int width =sizebutton.getSize().getWidth();
		System.out.println("Height is " + height + "Width is" + width);
		
		//4.Go to homepage
		
		WebElement homepage = driver.findElement(By.id("home"));
		homepage.click();
		
		

	}

}
