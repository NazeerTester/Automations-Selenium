package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAZEER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		
		Select selects = new Select(dropdown1);
		
		selects.selectByIndex(4);
		
		
		selects.selectByValue("3");
	
		
		selects.selectByVisibleText("Selenium");
		
		List<WebElement> lisofoptions =selects.getOptions();
		int size = lisofoptions.size();
		System.out.println("Number of element is  " + size );
		
		
		dropdown1.sendKeys("Loadrunner");
		
		WebElement multiselect =driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		
        Select multiselectbox= new Select(multiselect);
        multiselectbox.selectByIndex(1);
        multiselectbox.selectByIndex(2);
        multiselectbox.selectByIndex(3);
	}

}
