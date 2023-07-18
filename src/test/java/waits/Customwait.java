package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customwait {
	public static void main(String[] args) throws InterruptedException 
	{
		// to launch browser
	    WebDriver driver=new ChromeDriver();
	    
	    //to maximize the browser
	    driver.manage().window().maximize();
	    
	    //implicitly wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    //to load url
	    driver.get("http://localhost:8888");
	    
	    // to inspect and identify the username
	    WebElement UsernameEle=driver.findElement(By.name("user_name"));
	    
	    // to perform action on username
	    UsernameEle.sendKeys("admin");
	    
	    //to inspect and identify the password
	    WebElement passwordEle=driver.findElement(By.name("user_password"));
	    
	    //to perform action on password field
	    passwordEle.sendKeys("admin");
	    
	    // to inspect and identify the login button
	    WebElement LoginEle=driver.findElement(By.id("submitButton"));
	    
	    //customwait
	    waitandclick(LoginEle);
	    
	    
	}
public static void waitandclick(WebElement LoginEle) throws InterruptedException
{
	int count=0;
	if(count<10)
	{try
	{
		LoginEle.click();
	}
		catch (Exception e) {
		Thread.sleep(1000);
		count++;
		}
	}
}
}
