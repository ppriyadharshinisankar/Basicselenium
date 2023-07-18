package dropdownpractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singleselectdropdown {

	public static void main(String[] args) throws InterruptedException {
		// to launch browser
	    WebDriver driver=new ChromeDriver();
	    
	    //to maximize the browser
	    driver.manage().window().maximize();
	    
	    //to load url
	    driver.get("https://demoqa.com/select-menu");
	    
	  WebElement selectbox = driver.findElement(By.id("oldSelectMenu"));
	  
	  Select sel= new Select(selectbox);
	 //byindex
	  sel.selectByIndex(4);
	  System.out.println("selected by index");
	  Thread.sleep(2000);
	  
	  //by value
	  sel.selectByValue("2");
	  System.out.println("selected by value");
	  Thread.sleep(2000);
	  
	  //by visible index
	  sel.selectByVisibleText("Indigo");
	  System.out.println("selected by visible text");
	  
	  //is multiple
	 boolean type = sel.isMultiple();
	 int count=0;
	 if(type==true)
	 {   count++;
		 System.out.println("is multiselectbox");
	 }
	 else
	 {
		 System.out.println("single select");
	 }
	 
	 //getoptions
	 List<WebElement> Dropdownoptions = sel.getOptions();
	 for(WebElement element:Dropdownoptions)
	 {
		String optionavailable = element.getText();
		System.out.println(optionavailable);
	 }
	}

}
