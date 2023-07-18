package takescreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Capturescreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// to launch browser
	    WebDriver driver=new ChromeDriver();
	    
	    //to maximize the browser
	    driver.manage().window().maximize();
	    
	    //to load url
	    driver.get("http://localhost:8888");
	    
	    // to inspect and identify the username
	    
	    WebElement UsernameEle=driver.findElement(By.name("user_name"));
	    
	   
	    
	    //to inspect and identify the password
	    WebElement passwordEle=driver.findElement(By.name("user_password"));
	    
	   
	    // to inspect and identify the login button
	    WebElement LoginEle=driver.findElement(By.id("submitButton"));
	    
	    JavascriptExecutor js= (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].value='admin'", UsernameEle);
	    Thread.sleep(2000);
	    js.executeScript("arguments[0].value='admin'", passwordEle);
	    Thread.sleep(2000);
	    js.executeScript("arguments[0].click()", LoginEle);
	    Thread.sleep(2000);

	    TakesScreenshot ts=(TakesScreenshot) driver;
	    File sourcelocation = ts.getScreenshotAs(OutputType.FILE);
	    File destinationlocation = new File(".\\screenshot\\screenshot2.png");
	    Files.copy(sourcelocation, destinationlocation);
	    System.out.println("screenshots taken");
	}

}
