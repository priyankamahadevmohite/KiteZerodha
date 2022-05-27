package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browseropen;
import pom.HomepagePOM;
import pom.ZerodhaLogin;
import utility.Excel;

public class HomepageTest {
	WebDriver driver;
	
//	@BeforeMethod
//	public void openbrowser()
//	{
//	 	driver=Browseropen.openbrowser("https://kite.zerodha.com/");
//		
//	}
	
	
	@Test
	public void loginwithvalidcredentials() throws IOException
	{
//	    ZerodhaLogin login=new ZerodhaLogin(driver);
//	    String user=Excel.gettextdata(0, 1, "datahseet");
//		login.username(user);
//	    String pass=Excel.gettextdata(1, 1, "datasheet");
//		login.password(pass);
//		login.login();
//		String peen=Excel.gettextdata(2, 1, "datasheet");
//		login.pin(peen,driver);
//		login.continuebutton();
		HomepagePOM dashboard=new HomepagePOM(driver);
		dashboard.buystock(driver);
}
	
	
}