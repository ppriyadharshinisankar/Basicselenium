package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollUntil {

	public static void main(String[] args) throws InterruptedException {
		// to launch browser
	    WebDriver driver=new ChromeDriver();
	    
	    //to maximize the browser
	    driver.manage().window().maximize();
	    
	    //to load url
	    driver.get("https://www.selenium.dev/downloads/");
	    Thread.sleep(3000);
	    
	    WebElement scrolluntil = driver.findElement(By.xpath("//h2[.='Selenium Level Sponsors']"));
	    WebElement clickon = driver.findElement(By.xpath("//img[@alt='BrowserStack']"));
	    
	    Thread.sleep(3000);
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView();", scrolluntil);
	    
	    Thread.sleep(3000);
	    clickon.click();

	}

}
