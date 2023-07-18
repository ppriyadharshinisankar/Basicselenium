package notificationpopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notificationhandling {
	public static void main(String[] args) throws InterruptedException {
		
		//diablenotification
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		// to launch browser
	    WebDriver driver=new ChromeDriver(op);
	    
	    //to maximize the browser
	    driver.manage().window().maximize();
	    
	    //implicitly wait
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    //to load url
	    driver.get("https://www.yatra.com/");
	    
	    Thread.sleep(2000);

	
		
	}
	
	
}
