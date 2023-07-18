package dropdownpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class vtigerdropdown {

	public static void main(String[] args) {
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
	    driver.findElement(By.id("submitButton")).click();
	    
	    driver.findElement(By.partialLinkText("Organizations")).click();
	    
	    driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	    
	    driver.findElement(By.name("accountname")).sendKeys("practise");
	    
	    WebElement dropdown = driver.findElement(By.name("industry"));
	    Select sel =new Select(dropdown);
	    
	    sel.selectByVisibleText("Electronics");
	    System.out.println("selected by visible text");
	    
	    driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	    

	}

}
