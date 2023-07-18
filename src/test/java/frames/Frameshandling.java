package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frameshandling {
public static void main(String[] args) {
	
	// to launch browser
    WebDriver driver=new ChromeDriver();
    
    //to maximize the browser
    driver.manage().window().maximize();
    
    //implicitly wait
    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    //to load url
    driver.get("https://jqueryui.com/droppable/");
    
    //switch to frames
    driver.switchTo().frame(0);
    
    WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
	
    WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
    
    Actions act=new Actions(driver);
    act.dragAndDrop(drag, drop).perform();
    System.out.println("drag and drop is successful");
    
    //switch to main frame
    driver.switchTo().defaultContent();
    System.out.println("switched outside the frame");
    
    driver.findElement(By.linkText("Accept")).click();
    System.out.println("clicked on acept");
	
}
}
