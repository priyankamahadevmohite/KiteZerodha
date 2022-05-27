package test;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pojo.Browseropen;
import pom.Signup;
import pom.ZerodhaLogin;
import utility.Excel;

public class SignupTest {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void openbrowser()
	{
	 	driver=Browseropen.openbrowser("https://kite.zerodha.com/");
		
	}
		

@Test
	
	public void Signuppagevalidation()
	{   
        ZerodhaLogin login=new ZerodhaLogin(driver);
        login.signup();
        ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        Signup signUp=new Signup(driver);
		String actualTitle=driver.getTitle() ;
		String expectedtitle="Signup and open a Zerodha trading and demat account online and start investing – Zerodha";
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(actualTitle, expectedtitle);
		softAssert.assertTrue(signUp.logoimage());
//     	Assert.assertTrue(signUp.logoimage());
//		Assert.assertEquals(actualTitle, expectedtitle);
        signUp.entermobilenumber();
	    softAssert.assertAll();
		
	}

@Test

public void loginwithvalidcredentials() throws IOException
{
    ZerodhaLogin login=new ZerodhaLogin(driver);
    String user=Excel.gettextdata(0, 1, "datahseet");
	login.username(user);
    String pass=Excel.gettextdata(1, 1, "datasheet");
	login.password(pass);
	login.login();
	
	String peen=Excel.gettextdata(2, 1, "datasheet");
	login.pin(peen,driver);
	login.continuebutton();
	
}





}
