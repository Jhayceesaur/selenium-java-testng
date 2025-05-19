package testng_Package;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener is an interface which implements TestNG listeners

public class testNGListeners implements ITestListener 
{
    @Override
    public void onTestStart(ITestResult result) {
        // code
    }

    @Override
    public void onTestSuccess(ITestResult result) {
       System.out.println("Listeners successfully executed!");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        //Example #1: take a screenshot every time a test is failed
    	//Example #2: response if API is failed
    	 System.out.println("FAILED TEST CASE! " + result.getName()); //Concatenate the Method where it has particularly failed
    	
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // code
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // code
    }

    @Override
    public void onStart(ITestContext context) {
        // code
    }

    @Override
    public void onFinish(ITestContext context) {
        // code
    }
}
