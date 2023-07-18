package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickandhold {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	     System.out.println("Chrome launched");
	     
	     // to maximize the browser
	     
	     driver.manage().window().maximize();
	     
	     //to open a web application through url
	     driver.get("https://demoqa.com/buttons");
	     
	     WebElement click = driver.findElement(By.xpath("//button[.='Click Me']"));
	     
	     Actions act= new Actions(driver);
	     act.clickAndHold(click).perform();
	     System.out.println("clicked on element");
	     Thread.sleep(2000);
	     act.release(click).perform();
	     System.out.println("released");

	}

}
