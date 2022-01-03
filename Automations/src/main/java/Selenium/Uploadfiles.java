package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfiles {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAZEER\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/upload.html");
				
		WebElement uploadbutton=driver.findElement(By.name("filename"));
		uploadbutton.click();
		
		//String selection transfer as plain text
		//below 3 line code is to copy the text
		
		Thread.sleep(4000);
		String file="C:\\Users\\NAZEER\\Downloads\\testleaf.xlsx";
		
		StringSelection selection=new StringSelection(file);
		
		//windows handling
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

	   //now we need to paste the copied text
		
		Robot robot=new Robot();
	   robot.keyPress(KeyEvent.VK_CONTROL);//control the press
	   robot.keyPress(KeyEvent.VK_V);
	   robot.keyRelease(KeyEvent.VK_V);
	   robot.keyRelease(KeyEvent.VK_CONTROL);
	   Thread.sleep(4000);
	   robot.keyPress(KeyEvent.VK_ENTER);
	   robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
