package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowsexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAZEER\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String oldwindow =driver.getWindowHandle(); // here we identify the old window (parent window)
		
		WebElement homepage=driver.findElement(By.id("home"));
		homepage.click();
		
		Set<String> handles=driver.getWindowHandles();// this code identifies all the window which is opened by driver
		
				 //handles have old window and new window
		
		 for (String newwindow : handles) { // this For loop will switch from old window to new window
			driver.switchTo().window(newwindow);
		}
		
		 //with the help of foreach loop control is moved to new window
		 WebElement editbox=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/h5"));
	     editbox.click();
	     driver.close();
	     driver.switchTo().window(oldwindow); //moves the control back to old window
	
	     WebElement Openmultiplewindows=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
	     Openmultiplewindows.click();
	     
	     int numberofwindows =driver.getWindowHandles().size();
	     System.out.println("Number of windows opened is " +numberofwindows);
	     
	     WebElement Donnotcloseme =driver.findElement(By.id("color"));
	     Donnotcloseme.click();
	     
	     Set<String> newwindowhandles =driver.getWindowHandles();
	     
	     for (String allwindows : newwindowhandles) {
			if (!allwindows.equals(oldwindow))
			{
				driver.switchTo().window(allwindows);
				driver.close();
				
				driver.quit();
			}
		}
	}

}
