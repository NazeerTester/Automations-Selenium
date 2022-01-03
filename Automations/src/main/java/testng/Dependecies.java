package testng;

import org.testng.annotations.Test;

public class Dependecies {
	
	@Test(enabled = true)
	public void highschool()
	{
		System.out.println("High School");
	}
	
	@Test(dependsOnMethods ="highschool")
	public void highersecondary()
	
	{
		System.out.println("Higher secondary");
	
	}
	@Test (dependsOnMethods = "highersecondary")
	public void engineering()
	{
		System.out.println("Engineering");
	}
}
