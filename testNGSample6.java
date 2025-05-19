package testng_Package;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testNGSample6 {
	
	@Test (dependsOnMethods = {"WebpageAccess" , "Registration"}, dataProvider = "testData")
	//dependsOnMethod - this method will execute after the methods declared on the "dependsOnMethods" attribute
	//dataProvider - this method will get data provided in @DataProvider method
	public void Login(String username, String password) 
	{
		System.out.println("Login");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test (dependsOnMethods = {"Login", "MyProfile"})
	public void Logout() 
	{
		System.out.println("Logout");
	}
	
	@Test (enabled = false) //Helper attribute "enabled = false" that will Will SKIP executing a specific method
	public void Payment() 
	{
		System.out.println("Payment");
	}
	
	@Test (timeOut = 4000, dependsOnMethods = {"Login"})  //Wait "n" of seconds before throwing an error
	public void MyProfile() 
	{
		System.out.println("My Profile");
	}
	
	@Test
	public void WebpageAccess() 
	{
		System.out.println("WebpageAccess");
	}
	
	@Test (dependsOnMethods = {"WebpageAccess"})
	public void Registration() 
	{
		System.out.println("Registration");
	}
	
	@DataProvider //Parameterizing multiple test data
	public Object[][] testData() 
	{
		//1st combination - username and password: good credit history (1st row)
		//2nd combination - username and password: no credit history (2nd row)
		//3rd combination - username and password: fraudelent credit history (3rd row)
		Object [][] data = new Object[3][2]; //3 combinations; 2 data each combination
		
		//1st set
		data[0][0] = "firstusername";
		data[0][1] = "firstpassword";
		
		//2nd set
		data[1][0] = "secondusername";
		data[1][1] = "secondpassword";
		
		//3rd set
		data[2][0] = "thirdusername";
		data[2][1] = "thirdpassword";
		return data;
		//Columns in the row are nothing but value for that particular combination (row)
	}

}
