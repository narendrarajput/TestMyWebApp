package pom.mytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage 
{
	
	@FindBy(linkText = "Sign In")
	private WebElement signInLink;
	
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
}
