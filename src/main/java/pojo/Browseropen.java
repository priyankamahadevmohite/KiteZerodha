package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;





public class Browseropen {
public static WebDriver openbrowser(String url)
{
	ChromeOptions chromeoption = new ChromeOptions();
//	chromeoption.addArguments("--disable-notifications");
// 	 System.setProperty("webdriver.chrome.driver","D:\\Automation Testing\\KiteZerodha\\src\\main\\resources\\chromedriver.exe");
	
	WebDriverManager.chromedriver().setup();
 	WebDriver driver=new ChromeDriver(chromeoption);
 	driver.get(url);
 	return driver;
}
}