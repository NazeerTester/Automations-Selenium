package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocompletion_example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAZEER\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		WebElement input=driver.findElement(By.id("tags"));
		input.sendKeys("s");
		
		Thread.sleep(4000);
		//List webelement used bcz we need to use number of autocomplete elements
		//thats the reason we have findElements instead of findElement
		List<WebElement> optionlist=driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
	
		 System.out.println(optionlist.size());
		 
		for (WebElement webElementname : optionlist) {
			
			if(webElementname.getText().equals("Selenium"))
			{  webElementname.click();
			
			System.out.println("if part");
			break;
			}else {
			System.out.println("else part");
			}
			
		}
		}
	
	}

