package pom.mytest;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.media.AnalyserNode;

public class ExecuteTest 
{
	
	public static WebDriver driver = null;
	
	public static void main(String args[])
	{
		// Intitilize driver
		System.setProperty("webdriver.chrome.driver", "D:\\Application\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://bus.mymoneykart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		ContactUsPage conpage = new ContactUsPage(driver);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("divLoader")));
		
		conpage.contactUsLink.click();
		conpage.submitContactUsForm();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='result-content']/i")));
		
		System.out.println(conpage.NotificationMessage.getText());

	}

		
	
	

}
