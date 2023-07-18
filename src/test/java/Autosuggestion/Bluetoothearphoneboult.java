package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluetoothearphoneboult {

	public static void main(String[] args) {
		// to launch browser
	    WebDriver driver=new ChromeDriver();
	    
	    //to maximize the browser
	    driver.manage().window().maximize();
	    
	    //to load url
	    driver.get("https://www.amazon.in/");
	    
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bluetooth headphones");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	  List<WebElement> earphone = driver.findElements(By.xpath("//span[contains(text(),'Boult Audio')]"));
        for(WebElement element:earphone)
        {
        	String boult = element.getText();
        	System.out.println(boult);
        }
	}

}
