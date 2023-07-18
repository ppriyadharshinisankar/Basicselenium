package launchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//to launch browser
		
 // ChromeDriver driver=new ChromeDriver();
  //System.out.println("Chrome launched");
  
  //upcast chromedriver to webdriver
  
     WebDriver driver1=new ChromeDriver();
     System.out.println("Chrome launched");
     
     // to maximize the browser
     
     driver1.manage().window().maximize();
     
     driver1.manage().window().minimize();
     
     //to open a web application through url
     driver1.get("https://flipkart.com");
     System.out.println("flipkart is opened");
     
     //to get the title of the url
     
     String title =driver1.getTitle();
     System.out.println(title);
     
     //to get the current url address
     
    String currenturl= driver1.getCurrentUrl();
    System.out.println("currenturl is "+currenturl);
    
    //to get the pagesource
    
    String source=driver1.getPageSource();
    //System.out.println("Page source is - "+source);
    
    //to get session id
    
   String windowhandle= driver1.getWindowHandle();
   System.out.println("window handle "+windowhandle);
   
   //to close current tab
   
   driver1.close();
   System.out.println("flipkart is closed");
   
   //to close all tab/window
   
   driver1.quit();
   
   
   
   
    
    
    
		
	}

	}


