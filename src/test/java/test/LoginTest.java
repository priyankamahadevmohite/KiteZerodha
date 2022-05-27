package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pojo.Baseclass;
import pojo.Browseropen;
import pom.Signup;
import pom.ZerodhaLogin;
import utility.Excel;
import utility.Listnerpract;
import utility.ScreenShots;
@Listeners(Listnerpract.class)
public class LoginTest extends Baseclass {
    String Login; 

	@BeforeMethod
	public void openbrowser()
	{
	 	driver=Browseropen.openbrowser("https://kite.zerodha.com/");
	}

	@Test
	public void loginwithvalidcredentials() throws IOException, InterruptedException
	{
	    ZerodhaLogin login=new ZerodhaLogin(driver);
	    String user=Excel.gettextdata(0, 1, "datahseet");
		login.username(user);
	    String pass=Excel.gettextdata(1, 1, "datasheet");
		login.password(pass);
		login.login();
		Thread.sleep(2000);
		String peen=Excel.gettextdata(2, 1, "datasheet");
		login.pin(peen,driver);
		login.continuebutton();
		Assert.assertTrue(false);
    }
	
	
	@AfterMethod 
	public void screenshot() throws IOException
	{
		ScreenShots s=new ScreenShots();
		s.takescreenshot(driver,  "Login");
		//ScreenShots.Takescreenshot(driver, Login);
		
	}
	

}
	
