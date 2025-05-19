package testng_Package;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class testNGSample4 
{
	@Test
	public void WebLoginHomeLoan() 
	{
		//Selenium
		System.out.println("WebLoginHome");
		Assert.assertTrue(false);
	}
	
	@Test (groups={"Smoke"}) //Added in a group that will be part of methods that will execute for each class
	public void MobileLoginHomeLoan() 
	{
		//Appium
		System.out.println("MobileLoginHome");
	}
	
	@Test (groups={"Skip"}) //Added in a group that will NOT be part of methods that will execute for each class
	public void APILoginHomeLoan() 
	{
		//Rest API Automation
		System.out.println("APILoginHome");
	}
	
	@AfterMethod
	public void AfterMethod() //Will execute this test every after method within this class
	{
		System.out.println("Repeat this method for every method in testNGSample4");
	}

}
