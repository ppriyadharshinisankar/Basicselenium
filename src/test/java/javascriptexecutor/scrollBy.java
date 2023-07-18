package javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollBy {

	public static void main(String[] args) throws InterruptedException {
		// to launch browser
	    WebDriver driver=new ChromeDriver();
	    
	    //to maximize the browser
	    driver.manage().window().maximize();
	    
	    //to load url
	    driver.get("https://www.selenium.dev/downloads/");
	    Thread.sleep(3000);
	    
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	    //scroll down
	    js.executeScript("window.scrollBy(0,1000);","");
	    Thread.sleep(3000);
	    
	    //scrollup
	    js.executeScript("window.scrollBy(0,-1000);","");
	    Thread.sleep(3000);
	    
	    //scroll right
	    js.executeScript("window.scrollBy(200,0);","");
	    Thread.sleep(3000);
	    
	    //scroll left
	    js.executeScript("window.scrollBy(-200,0);", "");
	    Thread.sleep(3000);
	    //scrollTo full length down
	    js.executeScript("window.scrollTo(0,document.body.scrollHeight);", "");
	    Thread.sleep(3000);
	    
	    //scroll back up full length
	    js.executeScript("window.scrollTo(0,-document.body.scrollHeight);","");

	}

}
