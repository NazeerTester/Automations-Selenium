package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAZEER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement alertbox =driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alertbox.click();
		
		Alert alert=driver.switchTo().alert();// control will go to alert popup
	    Thread.sleep(4000);// thread sleep should not be in production bcz it will delay the time
		alert.accept();
		
		WebElement confirmbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		
		confirmbox.click();
		Thread.sleep(4000);
	    Alert confirmalert = driver.switchTo().alert();
	    confirmalert.dismiss();
	    
	    WebElement promptbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
	    promptbox.click();
	    Thread.sleep(4000);
	    Alert promptalert =driver.switchTo().alert();
	    promptalert.sendKeys("Semma");
	    Thread.sleep(4000);
	    promptalert.accept();
	
	}

}
