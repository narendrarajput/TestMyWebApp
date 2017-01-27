package pom.mytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
    WebDriver driver;

	@FindBy(id="EmailId")
	private WebElement emailAddress;
	
	@FindBy(id="Password")
	private WebElement passwrd;
	
	@FindBy(xpath = "//button[text()='login']")
	private WebElement loginButton;
	
	public void typeUsername(String username)
	{
		emailAddress.sendKeys(username);
	}
	public void typePassword(String password)
	{
		passwrd.sendKeys(password);
	}
	
	 public HomePage clickSubmit() 
	 {
	        loginButton.click();

			return new HomePage(driver);
	 }
	 
	 public HomePage loginWithValidCredentials(String userName, String pwd) {
	        typeUsername(userName);
	        typePassword(pwd);
	        return clickSubmit();
	    }
}
