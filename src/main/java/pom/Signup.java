package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {
    @FindBy(xpath="//img[@class=\"logo-img\"]")private WebElement logo;
	@FindBy(xpath="//input[@id='user_mobile']")private WebElement mobilenumber;
	

public Signup(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void entermobilenumber()
{
 mobilenumber.sendKeys("9356213164");	

}
public boolean logoimage()
{
return logo.isDisplayed();	
}

}