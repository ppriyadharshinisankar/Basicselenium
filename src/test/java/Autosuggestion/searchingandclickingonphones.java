package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchingandclickingonphones {

	public static void main(String[] args) {
		// to launch browser
	    WebDriver driver=new ChromeDriver();
	    
	    //to maximize the browser
	    driver.manage().window().maximize();
	    
	    //to load url
	    driver.get("https://www.amazon.in/");
	    
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Redmi");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    List<WebElement> list = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	    for(WebElement element:list)
	    {
	    	String phoneName = element.getText();
	    	System.out.println(phoneName);
	    }
	    
	    

	}

}
