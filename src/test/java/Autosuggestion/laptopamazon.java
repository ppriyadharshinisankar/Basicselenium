package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class laptopamazon {

	public static void main(String[] args) {
		
		// to launch browser
	    WebDriver driver=new ChromeDriver();
	    
	    //to maximize the browser
	    driver.manage().window().maximize();
	    
	    //to load url
	    driver.get("https://www.amazon.in/");
	    
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    List<WebElement> laptopname = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		  System.out.println("element identified");
	        for(WebElement element:laptopname)
	        {
	        	String lap = element.getText();
	        	if(lap.contains("HP"))
	        	
	        	{
	        		System.out.println(element.getText());
	        		element.click();
	        		break;
	        	}
	        	
	        }

		}

	}


