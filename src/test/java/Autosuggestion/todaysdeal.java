package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class todaysdeal {

	public static void main(String[] args) {
		// to launch browser
	    WebDriver driver=new ChromeDriver();
	    
	    //to maximize the browser
	    driver.manage().window().maximize();
	    
	    //to load url
	    driver.get("https://www.amazon.in/");
	    driver.findElement(By.linkText("Today's Deals")).click();
	 driver.findElement(By.xpath("//span[text()='Electronics']")).click() ;
	    List<WebElement> offer = driver.findElements(By.xpath("//div[contains(text(),'Up to 50% off')]"));
	    System.out.println("element identified");
        for(WebElement element:offer)
        {
        	String offerproduct = element.getText();
        }
	}

}
