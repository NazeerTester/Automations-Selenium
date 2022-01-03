package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAZEER\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		WebElement java=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input"));
		java.click();
		
		WebElement selenium =driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div"));
	    boolean seleniumselected=selenium.isSelected();
	    System.out.println(seleniumselected);
	    
	    //Deselect
	    
	    WebElement firstElement=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input"));
	
	      if(firstElement.isSelected()){
	    	  firstElement.click();
	      }
	     
	      WebElement SecondElement=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
	      if(SecondElement.isSelected()){
	    	  SecondElement.click();
	      }
	// last one select
	      
	      WebElement special=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[1]/input"));
	      special.click();
	}

}
