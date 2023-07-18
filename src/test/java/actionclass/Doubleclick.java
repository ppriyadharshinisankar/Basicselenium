package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
	     System.out.println("Chrome launched");
	     
	     // to maximize the browser
	     
	     driver.manage().window().maximize();
	     
	     //to open a web application through url
	     driver.get("https://demoapp.skillrary.com/product.php?product=java");
	     
	     WebElement add = driver.findElement(By.id("add"));
	     WebElement minus = driver.findElement(By.id("minus"));
	     
	     Actions act=new Actions(driver);
	     act.doubleClick(add).perform();
	     System.out.println("item added");
	     Thread.sleep(2000);
	     
	     act.doubleClick(minus).perform();
	     System.out.println("item removed");
	}

}
