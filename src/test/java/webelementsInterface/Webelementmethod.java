package webelementsInterface;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Webelementmethod {

	public static void main(String[] args) throws InterruptedException {
	
        WebDriver  driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		//sendkeys webelement method
		driver.findElement(By.className("textField")).sendKeys("admin");
		Thread.sleep(2000);
		//clear webelement method
		driver.findElement(By.className("textField")).clear();
		driver.findElement(By.className("textField")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		// click webelement method
		//driver.findElement(By.id("loginButton")).click();
		
		//webelement getattribute method
		
		String Attributename=driver.findElement(By.id("loginButton")).getAttribute("id");
		System.out.println(Attributename);
		
		//webelement method getTagname
		String Tagname=driver.findElement(By.id("loginButton")).getTagName();
		System.out.println(Tagname);
		
		//webelement method getText
		String text=driver.findElement(By.id("loginButton")).getText();
		System.out.println(text);
		
		//webelement method getLocation()
		
		Point position = driver.findElement(By.id("loginButton")).getLocation();
		int posX=position.getX();
		System.out.println("xth position is "+posX);
		int posY=position.getY();
		System.out.println("yth position is "+posY);
		
		//webelement method getSize() will give dimension of the element
		Dimension size = driver.findElement(By.id("loginButton")).getSize();
		int Height = size.getHeight();
		System.out.println("Height is "+Height );
		int width = size.getWidth();
		System.out.println("width is "+width);
		
		//webelement method getRect() will give position and dimension of the element
		
		Rectangle rect = driver.findElement(By.id("loginButton")).getRect();
		int x = rect.getX();
		System.out.println("rect x is "+x);
		int y = rect.getY();
		System.out.println("rect y is "+y);
		int H = rect.getHeight();
		System.out.println("rect height is "+H);
		int W = rect.getWidth();
		System.out.println("rect width is "+W);
		
		//webelement method getCSSValue give the appearance of the element
		
		String CSSValue = driver.findElement(By.id("loginButton")).getCssValue("border-radius");
		System.out.println("CSS VALUE IS "+CSSValue);
		
		//webelement method getAriaRole give the design type
		String AriaRole = driver.findElement(By.id("loginButton")).getAriaRole();
		System.out.println("AriaRole is "+AriaRole);
		
		String AriaRoleusername = driver.findElement(By.name("username")).getAriaRole();
		System.out.println("AriaRole is "+AriaRoleusername);
		
		
		//webelement method getAccessibleName give the text present in value or text attribute
		String accesiblename = driver.findElement(By.name("username")).getAccessibleName();
		System.out.println("accesiblename is "+accesiblename);
		
		//isDisplayed() verification method check whether element is present in dom structure
		boolean Displayed = driver.findElement(By.name("username")).isDisplayed();
		if(Displayed==true)
		{
			driver.findElement(By.name("username")).sendKeys("admin");
			System.out.println("element is displayed");
		}
		else
		{
			System.out.println("element not displayed");
		}
		
		//isEnabled() verification method check whether element present is loaded in dom structure
		
		boolean Enabled = driver.findElement(By.name("username")).isEnabled();
		if(Enabled==true)
		{
			driver.findElement(By.name("username")).clear();
			System.out.println("element is enabled");
		}
		else
		{
			System.out.println("element is not enabled");
		}
		
		//isSelected() verification method check whether element present in checkbox or dropdown or radio button is selected
		
		boolean selected = driver.findElement(By.name("username")).isSelected();
		if(selected==true)
		{
			System.out.println("element is selected");
		}
		else
		{
			System.out.println("element is not selected");
		}
		
		//getDOMAttribute() give the text for the attribute value
		String Domattribute = driver.findElement(By.name("username")).getDomAttribute("type");
		System.out.println("Domattribute is "+Domattribute);
		
		//getDomproperty() give the input which user has entered
            driver.findElement(By.name("username")).sendKeys("admin");
           String property = driver.findElement(By.name("username")).getDomProperty("value");
	       System.out.println("property name is"+property);
	       
	       //submit()
	       driver.get("http://localhost:8888");
	       driver.findElement(By.name("user_name")).sendKeys("admin");
	       driver.findElement(By.name("user_password")).sendKeys("admin");
	       driver.findElement(By.id("submitButton")).submit();
	       System.out.println("SUBMIT WORKED");
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
