package testng_Package;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGSample2 
{
	@Test (groups={"Smoke"}) //Another Module Test Case Sample || //Added in a group that will be part of methods that will execute for each class
	public void Test1()
	{
		System.out.println("Testing only (1)");
	}
	
	@BeforeTest (groups={"Skip"}) //Will execute this test before any test in this test folder || //Added in a group that will NOT be part of methods that will execute for each class
	public void Test2()
	{
		System.out.println("I will execute first");
	}
	
	@AfterTest //Will execute this test before any test in this test folder
	public void Test3()
	{
		System.out.println("I will execute last");
	}
}

//**Note: Placement of Annotation does not have bearing and will always execute based on the given annotation