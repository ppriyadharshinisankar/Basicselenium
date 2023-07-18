package dropdownpractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselectdropdown {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		    
		    //to maximize the browser
		    driver.manage().window().maximize();
		    
		    //to load url
		    driver.get("https://demoqa.com/select-menu");
		    WebElement multiselect = driver.findElement(By.id("cars"));
		    Select sel=new Select(multiselect);
		   boolean value = sel.isMultiple();
		   if(value==true)
		   {
			   System.out.println("its multiselect");
		   }
		   else
		   {
			   System.out.println("single select");
		   
		   }
		    sel.selectByValue("volvo");
		    Thread.sleep(2000);
		    System.out.println("volvo selected");
		    sel.selectByVisibleText("Audi");
		    System.out.println("Audi selected");
		    Thread.sleep(2000);
		    sel.selectByIndex(1);
		    System.out.println("saab is selected");
		    
		    //deslect option
		    sel.deselectByValue("audi");
		    System.out.println("audi is deselected");
		    
		    List<WebElement> allselectedoption = sel.getAllSelectedOptions();
		   for( WebElement ele:allselectedoption)
		   {
			   System.out.println(ele.getText());
		   }
		   
		   //firstselectedoption
		   WebElement firstselected = sel.getFirstSelectedOption();
				   System.out.println(firstselected.getText());
			//wrapped element
				   WebElement wrapped = sel.getWrappedElement();
						   System.out.println("wrapped elements are "+wrapped.getText());
				   
	}

}
