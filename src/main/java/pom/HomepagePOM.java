package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomepagePOM {
    
	@FindBy(xpath="//span[@class='nice-name']")private List<WebElement>stocks;
	@FindBy(xpath = "//button[@class='button-blue buy']")private WebElement buy;
	
	public HomepagePOM(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public void buystock(WebDriver driver)
	{ 
		WebDriverWait wait=new WebDriverWait(driver,3000);
		wait.until(ExpectedConditions.visibilityOfAllElements(stocks));
		String stockname="TATACOFFEE";
		for(int i=0;i<stocks.size();i++)
	{ String actual= stocks.get(i).getText();
	 if (actual.equalsIgnoreCase(stockname))
	 {
	    Actions act=new Actions(driver);
	    act.moveToElement(stocks.get(i));
	    act.perform();
	    buy.click(); 			
	}
	}
}
}