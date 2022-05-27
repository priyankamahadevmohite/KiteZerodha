package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots {
public  void takescreenshot(WebDriver driver,String name) throws IOException
{
	  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("_ddMMyyy_HHmmss");
		LocalDateTime now = LocalDateTime.now();
		String date = dtf.format(now);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\Automation Testing\\KiteZerodha\\screenshot\\"+name+date+".png");
		FileHandler.copy(source, destination);	 
}
//	public void Takescreenshot(WebDriver driver,String name) throws IOException
//	{
//		String timestamp=new SimpleDateFormat("yyyy_MM_dd_hr_mm_ss").format(new Date());
//		
//		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File Destination=new File("D:\\Automation Testing\\KiteZerodha\\screenshot\\"+name+timestamp+".png");
//		FileHandler.copy(source, Destination);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
