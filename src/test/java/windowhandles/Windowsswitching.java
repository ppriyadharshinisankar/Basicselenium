package windowhandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowsswitching {
	private static final boolean String = false;

	public static void main(String[] args) throws InterruptedException {
		// to launch browser
	    WebDriver driver=new ChromeDriver();
	    
	    //to maximize the browser
	    driver.manage().window().maximize();
	    
	    //implicitly wait
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    //to load url
	    driver.get("https://demo.automationtesting.in/Windows.html");
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Open New Seperate Windows")).click();
	    String mainid = driver.getWindowHandle();
	    System.out.println(mainid);
	    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	    Thread.sleep(2000);
	    
	    //if the page has single child window
	  // Set<String> windows = driver.getWindowHandles();
	    //for(String win:windows)
	    // {
		 //  if(!win.equals(mainid))
		 //  {
			 //  System.out.println("child id is"+win);
			//   driver.switchTo().window(win);
			//   System.out.println("switched to child window");
		  // }
	  // }
	   
	   //if the page has multiple child window
	   Set<String> windows1 = driver.getWindowHandles();
	   for(String win:windows1)
	   {
		   WebDriver currentwinid = driver.switchTo().window(win);
		   String currentTitle = currentwinid.getTitle();
		   if(currentTitle.contains("Selenium"))
		   {
			   System.out.println("control switched to child window");
			   break;
		   }
	   }
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//span[.='Downloads']")).click();
	   System.out.println("clicked on downloads");
	   Thread.sleep(1000);
	   
	   //switch back to parent window
	   for(String win:windows1)
	   {
		   WebDriver currentwinid = driver.switchTo().window(win);
		   String currentTitle = currentwinid.getTitle();
		   if(currentTitle.contains("Frames"))
		   {
			   System.out.println("control switched to parent window");
			   break;
		   }
	   }
	   driver.findElement(By.linkText("Register")).click();
	   Thread.sleep(1000);
	   System.out.println("clicked on rigester");

}
}