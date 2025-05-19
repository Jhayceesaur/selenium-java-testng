package testng_Package;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class testNGSample5 
{
	@Test (groups={"Smoke"}) //Added in a group that will be part of methods that will execute for each class
	public void WebLoginCalamityLoan() 
	{
		//Selenium
		System.out.println("WebLoginCalamity");
	}
	
	@Test (groups={"Skip"}) //Added in a group that will NOT be part of methods that will execute for each class
	public void MobileLoginCalamityLoan() 
	{
		//Appium
		System.out.println("MobileLoginCalamity");
	}
	
	@Test
	public void MobileLoginCalamityLoanSignIn() 
	{
		//Appium
		System.out.println("MobileLoginCalamitySignIn");
	}
	
	@AfterSuite //Will execute this test on the very last part in this test suite
	public void BFSuite() 
	{
		//Appium
		System.out.println("I am the first in the last");
	}
	
	@Test
	public void MobileLoginCalamityLoanSignOut() 
	{
		//Appium
		System.out.println("MobileLoginCalamitySignOut");
	}
	
	@Test
	public void APILoginCalamityLoan() 
	{
		//Rest API Automation
		System.out.println("APILoginCalamity");
	}

}
