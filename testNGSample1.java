package testng_Package;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNGSample1 
{
	@Test (groups={"Skip"}) //1st Test Case || //Added in a group that will NOT be part of methods that will execute for each class
	public void Demo1() 
	{
		System.out.println("Welcome,");
	}
	
	@Parameters({"URL1"}) //Parameterizing concept
	@Test //2nd Test Case
	public void Demo2(String urlName1) 
	{
		System.out.println("User!");
		System.out.println(urlName1);
	}
	
	@Test (groups={"Smoke"}) //3rd Test Case || //Added in a group that will be part of methods that will execute for each class
	public void Demo3() 
	{
		Scanner scan = new Scanner(System.in);
		
		int favNum = 20;
		
		System.out.println("Please enter your favorite number: ");
		int inputFavNum = scan.nextInt();
		
		if (inputFavNum == favNum)
		{
			System.out.println("Very good!");
		}
		else 
		{
			Assert.fail("Number " + inputFavNum + " is not your favorite number");
		}
	}
}
