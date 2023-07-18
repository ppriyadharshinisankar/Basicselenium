package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitlywait {

	public static void main(String[] args) {
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
	    
	    // to perform action on login button
	    LoginEle.click();
	    
	    // click on contacts link in Homepage
	   // driver.findElement(By.linkText("Contacts")).click();
	    
	    // using partiallinktext
	    driver.findElement(By.partialLinkText("Organizations")).click();
	    
	    //1st case xpath
	    //driver.findElement(By.xpath("//input[@class='searchBox']")).sendKeys("Organization");
	    
	    
	    driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	    

	}

}
