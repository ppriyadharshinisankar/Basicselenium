package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popuphandling {
public static void main(String[] args) {
	// to launch browser
    WebDriver driver=new ChromeDriver();
    
    //to maximize the browser
    driver.manage().window().maximize();
    
    //implicitly wait
    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    //to load url
    driver.get("https://demoqa.com/alerts");
    
    driver.findElement(By.id("alertButton")).click();
    driver.switchTo().alert().accept();
    System.out.println("clicked on accept");
    
 driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
Alert text = driver.switchTo().alert();
String gettext = text.getText();
System.out.println(gettext);
driver.switchTo().alert().dismiss();
 String message = driver.findElement(By.xpath("//span[@class='text-success']")).getText();
System.out.println(message);


    
}
}
