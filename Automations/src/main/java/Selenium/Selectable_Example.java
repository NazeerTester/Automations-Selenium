package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NAZEER\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/selectable.html");
		//To verify number of selectable list
		List<WebElement> selectable=driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
	    int listsize=selectable.size();
	    System.out.println(listsize);
	    
	    //actions to interact with keyboard and mouse,Mostly for mouse interaction
	    //Actions actions=new Actions(driver);
	    //actions.keyDown(Keys.CONTROL)
	    //.click(selectable.get(0))
	    //.click(selectable.get(1)).click(selectable.get(2)).build().perform();
	    
	    //Another way to do above code to select multiple selections
	    Actions actions=new Actions(driver);
	    actions.clickAndHold(selectable.get(0));
	    actions.clickAndHold(selectable.get(1));
	    actions.clickAndHold(selectable.get(2));
	    actions.build().perform();
	
	}

}
