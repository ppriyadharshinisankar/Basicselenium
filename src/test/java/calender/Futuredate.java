package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Futuredate {

	public static void main(String[] args) throws InterruptedException {
		// to launch browser
	    WebDriver driver=new ChromeDriver();
	    
	    //to maximize the browser
	    driver.manage().window().maximize();
	    
	    //implicitly wait
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    //to load url
	    driver.get("https://www.makemytrip.com/");
	    
	    Thread.sleep(6000);
	    
	    Actions act=new Actions(driver);
	    act.moveByOffset(10,10).click().perform();
	    
	    
	    
	    
         
	   // driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
	    
	    Thread.sleep(1000);
	   // driver.findElement(By.xpath("//span[@class='ic_circularclose_grey']")).click();
	    
	    WebElement source = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	    source.sendKeys("del");
	    
	    
	   
	   
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//p[.='New Delhi, India']")).click();
	   
	    Thread.sleep(2000);
	   
	    
	   WebElement to = driver.findElement(By.xpath("//input[@id='toCity']"));
	   to.sendKeys("mum");
	   Thread.sleep(1000);
	    driver.findElement(By.xpath("//p[.='Mumbai, India']")).click();
	    
	    
	    //driver.findElement(By.xpath("//span[.='Departure']")).click();
	    
	    Thread.sleep(1000);
	    
	    for(;;)
	    {
	    	try 
	    	{
	    		driver.findElement(By.xpath("//div[@aria-label='Tue Oct 31 2023']")).click();
	    		break;
				
			} catch (Exception e) 
	    	{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				Thread.sleep(1000);
			}
	    }
	    
	  

	}

}
