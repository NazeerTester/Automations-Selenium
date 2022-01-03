package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAZEER\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Image.html");
		
		//WebElement images=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		//images.click();
		
		WebElement brokenimages=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
				
		
		//if natural width CSS is o then the image is broken
		
		if(brokenimages.getAttribute("naturalwidth").equals("0"))
		{
			System.out.println("Image is broken");
		}
		else
		{
			System.out.println("Image is NOT broken");
		}
	}

}
