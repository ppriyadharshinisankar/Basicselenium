package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class mousehovering {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
	     System.out.println("Chrome launched");
	     
	     // to maximize the browser
	     
	     driver.manage().window().maximize();
	     
	     
	     
	     //to open a web application through url
	     driver.get("https://flipkart.com");
	     driver.findElement(By.xpath("//button[.='✕']")).click();
	     Actions act =new Actions(driver);
	     act.moveByOffset(10,10).click().perform();
	     System.out.println("moved by offest");
	     
	     WebElement element = driver.findElement(By.xpath("//div[.='Electronics']"));
	     
	     act.moveToElement(element).perform();
	     System.out.println("mouse hovered");

	}

}
