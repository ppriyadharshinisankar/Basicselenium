package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practiceactionsinflipkart {

	public static void main(String[] args) throws InterruptedException {
		// to launch browser
	    WebDriver driver=new ChromeDriver();
	    
	    //to maximize the browser
	    driver.manage().window().maximize();
	    
	    //to load url
	    driver.get("https://www.flipkart.com/");
	  driver.findElement(By.xpath("//button[.='✕']")).click();
	    
	    driver.findElement(By.xpath("//img[@alt='Appliances']")).click();
	    Thread.sleep(2000);
	    WebElement home = driver.findElement(By.xpath("//span[.='Home & Furniture']"));
	    Actions act=new Actions(driver);
	    act.moveToElement(home).click().perform();
	    System.out.println("moved to home and furniture");
	    Thread.sleep(2000);
driver.findElement(By.xpath("//a[.='Paintings']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[.='Price -- High to Low']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//img[@alt='HandPainted Artwork Canvas 28 inch x 28 inch Painting']")).click();
	}

}
