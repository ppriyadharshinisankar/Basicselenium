package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class laptop
{

	public static void main(String[] args) throws InterruptedException {
		// to launch browser
	    WebDriver driver=new ChromeDriver();
	    
	    //to maximize the browser
	    driver.manage().window().maximize();
	    
	    //to load url
	    driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//button[.='✕']")).click();
	    
	    driver.findElement(By.name("q")).sendKeys("lapotop");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(5000);
	    
	  WebElement laptopname = driver.findElement(By.xpath("//div[@class='_4rR01T']"));
	  System.out.println(laptopname.getText());
	 
       
	}

}
