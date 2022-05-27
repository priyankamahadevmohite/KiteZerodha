package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaLogin {
	
@FindBy(xpath="//input[@id='userid']")private WebElement username;
@FindBy(xpath="//input[@id='password']")private WebElement password;
@FindBy(xpath= "//button[@type=\"submit\"]") private WebElement login;
@FindBy(xpath="//a[@href=\"/forgot\"]")private WebElement forgot;
@FindBy(xpath="//a[@class='text-light']")private WebElement signup;
@FindBy(xpath="//input[@id='pin']")private WebElement pin;
@FindBy(xpath="//button[@class='button-orange wide']")private WebElement continuebutton;

public ZerodhaLogin(WebDriver driver)
{
PageFactory.initElements(driver, this);
}

public void username(String user)
{
username.sendKeys(user);	
}

public void password (String pass)
{
password.sendKeys(pass);
}

public void login()
{
login.click();	

}

public void forgot()
{
 forgot.click();	
}

public void pin(String peen,WebDriver driver)
{
	WebDriverWait wait=new WebDriverWait(driver,2000);
	wait.until(ExpectedConditions.visibilityOf(pin));
	pin.sendKeys(peen);
}

public void continuebutton()
{
continuebutton.click();	

}
public void signup()
{
signup.click();	
}

}