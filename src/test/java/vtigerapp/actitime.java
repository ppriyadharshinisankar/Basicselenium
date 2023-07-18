package vtigerapp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver  driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		//using class locator
		WebElement USERNAME=driver.findElement(By.cssSelector("input[type='text']"));
		
		USERNAME.sendKeys("admin");
		
		//WebElement password=driver.findElement(By.cssSelector("input[class='textField pwdfield']"));
		
		// short for class attribute
		WebElement password=driver.findElement(By.cssSelector("input.pwdfield"));
		
		password.sendKeys("manager");
		
		// short cut for id attribute
		driver.findElement(By.cssSelector(" a#loginButton")).click();
		//driver.findElement(By.cssSelector(" a[id='loginButton']")).click();
		Thread.sleep(4000);
		
	 driver.findElement(By.id("container_tasks")).click();
	 Thread.sleep(1000);
	
	
		
		//List<WebElement> element1 = driver.findElements(By.xpath("//div[@class='img']"));
		//for(WebElement element:element1)
		//{
			//element.click();
		//	Thread.sleep(1000);
		//}
		//List<WebElement> element2 = driver.findElements(By.xpath("//div[@class='customerTitle']"));
		//for(WebElement element:element2)
		//{
			///String s=element.getText();
			//System.out.println(s);
		//}
	 
	 driver.findElement(By.xpath("(//div[@class='img'])[2]")).click();
	 Thread.sleep(1000);
	 
	 driver.findElement(By.xpath("(//div[.='Copy to'])[1]")).click();
	 Thread.sleep(1000);
	 
	 driver.findElement(By.xpath("(//div[.='Copy']/following-sibling::div[.='Cancel'])[3]")).click();
	}

}
