package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Suiteexample {
	WebDriver driver;
	long starttime;
	long endtime;
	
	@BeforeSuite
	public void launchbrowser ()
	{
		starttime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAZEER\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void openchrome()
	{
		driver.get("http://www.google.co.in");
	}
	@Test
	public void bing()
	{
		driver.get("http://www.bing.com");
	}
	@Test
	public void openyahoo()
	{
		driver.get("http://www.yahoo.com");
	}
	@AfterSuite
	public void closebrowser()
	{
		driver.quit();
		endtime = System.currentTimeMillis();
		long totaltime=endtime -starttime;
		System.out.println("Totaltime" + totaltime);

	}

}
