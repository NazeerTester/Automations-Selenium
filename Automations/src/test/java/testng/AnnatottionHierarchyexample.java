package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnatottionHierarchyexample {
  
	@Test
  public void test() {
	  System.out.println("I am test");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("I am beforemethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am aftermethod");
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("I am beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am afterclass");
  }
  

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I am aftertest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I am beforesuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I am aftersuite");
  }

}
