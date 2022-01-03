package Selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class HowtoDownload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAZEER\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement downloadlink=driver.findElement(By.linkText("Download Excel"));
	    downloadlink.click();
	    Thread.sleep(2000);
	
	   //in java we have sepearate file class,
	   // can use it here we will create object 
	    File filename=new File("C://Users//NAZEER//Downloads//") ;
	    //file path//irukanum
	    File[] totalfiles= filename.listFiles();
	    
	    for (File file : totalfiles) {
			if(file.getName().equals("testleaf.xlsx"))
				System.out.println("File is downloading");
			    break;
		}
	}

}
