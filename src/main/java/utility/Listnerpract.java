package utility;

import pojo.Baseclass;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class Listnerpract extends Baseclass implements ITestListener {

	public void onTestStart(ITestResult result)
	{
	System.out.println("Test is start"+result.getName());	
	
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test is successful"+result.getName());
	}
	public void onTestFailure(ITestResult result)
	{
		try {
			ScreenShots s=new ScreenShots();
			s.takescreenshot(driver, "LoginFail");
			}
		
		catch(Exception e){
			e.printStackTrace();
			}
	}
}
