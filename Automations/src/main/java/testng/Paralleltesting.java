package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Paralleltesting {
	
	@Test
	public void Opengoogle()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAZEER\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.quit();
	}
	@Test
	public void Openbing()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAZEER\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.bing.com");
		driver.quit();
	}
	



}
