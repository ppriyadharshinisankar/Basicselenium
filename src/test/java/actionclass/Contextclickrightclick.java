package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextclickrightclick {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
	     System.out.println("Chrome launched");
	     
	     // to maximize the browser
	     
	     driver.manage().window().maximize();
	     
	     //to open a web application through url
	     driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	     
	     WebElement rightclick = driver.findElement(By.xpath("//span[.='right click me']"));
	     WebElement ele = driver.findElement(By.xpath("//span[.='Edit']"));
         Actions act =new Actions(driver);
         act.contextClick(rightclick).perform();
         Thread.sleep(2000);
         act.click(ele).perform();
	}

}
