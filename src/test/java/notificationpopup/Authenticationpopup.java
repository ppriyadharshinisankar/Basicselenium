package notificationpopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticationpopup {

	public static void main(String[] args) {
		// to launch browser
	    WebDriver driver=new ChromeDriver();
	    
	    //to maximize the browser
	    driver.manage().window().maximize();
	    
	    //implicitly wait
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    //to load url
	    driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
