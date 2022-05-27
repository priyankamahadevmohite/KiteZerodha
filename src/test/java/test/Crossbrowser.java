package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Crossbrowser {

	@Test
	@Parameters("browser")
	public void crossbrowsertest(String browsername)
	{
		if (browsername.equalsIgnoreCase("chrome"))
		
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://kite.zerodha.com");
	}
		else if (browsername.equalsIgnoreCase("Firfox"))

		{
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver=new FirefoxDriver();
			driver.get("https://kite.zerodha.com");
		}
		
	}
}
