package testng_Package;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNGSample3 
{
	@Test
	public void WebLoginCarLoan() 
	{
		//Selenium
		System.out.println("WebLoginCar");
	}
	
	@BeforeSuite //Will execute this test first before any test in this test suite
	public void BFSuite() 
	{
		//Appium
		System.out.println("I am number 1");
	}
	
	@Test
	public void MobileLoginCarLoan() 
	{
		//Appium
		System.out.println("MobileLoginCar");
	}
	
	@BeforeMethod (groups={"Skip"}) //Will execute this test first before every method within this class || //Added in a group that will NOT be part of methods that will execute for each class
	public void BeforeMethod() 
	{
		System.out.println("I will execute first before any method in this class testNGSample3");
	}
	
	@Test (groups={"Smoke"}) //Added in a group that will be part of methods that will execute for each class
	public void APILoginCarLoan() 
	{
		//Rest API Automation
		System.out.println("APILoginCarLoan");
	}
	
	@Parameters({"URL2", "APIkey"}) //Parameterizing concept
	@Test
	public void urlLoginCarLoan(String urlName2, String apiKey) 
	{
		//Appium
		System.out.println("urlLoginCar");
		System.out.println(urlName2);
		System.out.println(apiKey);
	}

}

//**Note: TestNG execution is based on the alphabetical order of methods
