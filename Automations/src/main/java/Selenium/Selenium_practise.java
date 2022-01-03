package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium_practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Users\\NAZEER\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Edit.html");

		WebElement emailbox = driver.findElement(By.id("email"));
		emailbox.sendKeys("tester@gmail.com");

		WebElement appendbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		appendbox.sendKeys("Text");

		WebElement getTextbox = driver.findElement(By.name("username"));
		String value =
				getTextbox.getAttribute("value");


		System.out.println(value);

		WebElement Clearbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		Clearbox.clear();
		
		WebElement disabledbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
        boolean enabled = disabledbox.isEnabled();
        System.out.println(enabled);
	}


}
