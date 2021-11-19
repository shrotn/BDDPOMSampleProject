package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
    WebElement btnClick;
    
    @FindBy(xpath="//a[text()='Forgot your password?']")
    WebElement forgotPwd;
    
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Login(String strUsr, String strPwd)
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   username.sendKeys(strUsr);
	   password.sendKeys(strPwd);
	   btnClick.click();
	   
	   
	}
}
