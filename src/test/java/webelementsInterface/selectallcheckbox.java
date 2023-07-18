package webelementsInterface;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectallcheckbox {

	public static void main(String[] args) throws InterruptedException 
	{
		// to launch browser
	    WebDriver driver=new ChromeDriver();
	    
	    //to maximize the browser
	    driver.manage().window().maximize();
	    
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
	    
	    //click on org link\
	    driver.findElement(By.linkText("Organizations")).click();
	    
	    //select multiple checkbox
	   List<WebElement> List = driver.findElements(By.xpath("//input[@name='selected_id']"));
	   
	   for(WebElement element:List) 
	   {
		   element.click();
		   Thread.sleep(1000);
	   }
	   
       List<WebElement> List1 = driver.findElements(By.xpath("//a[@title='Organizations']"));
	   
	   for(WebElement element:List1) 
	   {   String VALUE = element.getText();
		   System.out.println("element name is "+VALUE);
		   Thread.sleep(1000);
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}

}
