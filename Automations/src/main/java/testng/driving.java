package testng;

import org.testng.annotations.Test;

public class driving {
	
	@Test(priority=0)
	public void startthecar()
	{
		System.out.println("Car started");
	}
	@Test(priority=1)
	public void firstgear()
	{
		System.out.println("1st gear");
	}
	@Test(priority=2)
	public void secondgear()
	{
		System.out.println("2nd gear");
	}
	@Test(priority=3)
	public void thirdgear()
	{
		System.out.println("thirdgear");
	}

}
