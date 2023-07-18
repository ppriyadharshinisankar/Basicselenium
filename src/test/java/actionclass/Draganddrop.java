package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {

		 WebDriver driver=new ChromeDriver();
	     System.out.println("Chrome launched");
	     
	     // to maximize the browser
	     
	     driver.manage().window().maximize();
	     
	     //to open a web application through url
	     driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	     
	     WebElement capital = driver.findElement(By.xpath("//div[.='Washington'][2]"));
	     WebElement country = driver.findElement(By.xpath("//div[.='United States']"));
	     Actions act=new Actions(driver);
	     act.dragAndDrop(capital, country).perform();
	     Thread.sleep(2000);
	     
	     System.out.println("draganddrop is done");
	     WebElement capital1 = driver.findElement(By.xpath("//div[.='Seoul'][2]"));
	     WebElement country1 = driver.findElement(By.xpath("//div[.='South Korea']"));
	     act.dragAndDrop(capital1, country1).perform();
	     System.out.println("2nd drag and drop id done");
	}

}
