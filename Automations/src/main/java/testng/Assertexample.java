package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertexample {
	
	String name = "Nazeer";
	boolean value = false;
	
	@Test
	public void checkequal()
	{
		//System.out.println("Nazeer");
		
		Assert.assertEquals(name, "Nazeer");
	}
	
	@Test
	public void checknotequal()
	{
		//System.out.println("Nazeer");
		
		Assert.assertNotEquals(name, "Nazeers");
	}
	
	@Test
	public void Asserttrue()
	{
		//System.out.println("Nazeer");
		
		Assert.assertTrue(value, "This is true");
	}
	
	@Test
	public void Assertfalse()
	{
		//System.out.println("Nazeer");
		
		Assert.assertFalse(value,"This is true");
	}


}
