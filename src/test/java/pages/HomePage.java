package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
	
	//locators
	
	@FindBy(xpath="//span[@class='user-display']")
    WebElement userName;
    
    @FindBy(xpath="//span[text()='Contacts']")
    WebElement contactLink;
    

	public HomePage() {
				    
		PageFactory.initElements(driver, this);
	}
	
	 //Actions
    public boolean isValidUser() {
        return userName.isDisplayed();
    }
    
    public void navigateToContactPage() {
        contactLink.click();
        
    }

}
