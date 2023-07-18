package testng;

import org.testng.annotations.Test;

public class Testngpractise 
{
@Test(priority = 2)
public void sampletest() 
   {
	System.out.println("hi");
		
	}
@Test(priority = 0)
public void test()
{
	System.out.println("hello");
}

@Test(priority = -3)
public void negmethod()
{
	System.out.println("1st executed");
}
}
