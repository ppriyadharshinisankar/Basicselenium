package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handledisabledelements {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
	    
	    //to maximize the browser
	    driver.manage().window().maximize();
	    
	    //to load url
	    driver.get("https://demoapp.skillrary.com/");
	    Thread.sleep(3000);
	    
	   WebElement element = driver.findElement(By.xpath("//input[@class='form-control']"));
	   Thread.sleep(3000);
	   
	   JavascriptExecutor js=(JavascriptExecutor) driver;
	   js.executeScript("arguments[0].value='disable'", element);

	}

}
