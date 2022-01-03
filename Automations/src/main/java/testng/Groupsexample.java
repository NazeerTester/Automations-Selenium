package testng;

import org.testng.annotations.Test;

public class Groupsexample {
	
	@Test(groups= {"Moto"})
	public void Moto1()
	{
		System.out.println("Motorola1");
	}
	
	@Test(groups= {"Moto"})
	public void Moto2()
	{
		System.out.println("Motorola1");
	}
	
	@Test(groups= {"Apple"})
	public void Apple()
	{
		System.out.println("Apple");
	}
	
	@Test(groups= {"oppo"})
	public void oppo()
	{
		System.out.println("OPPO");
	}
	
	@Test(groups= {"lenova22"})
	public void lenovo()
	{
		System.out.println("Lenova");
	}
}
