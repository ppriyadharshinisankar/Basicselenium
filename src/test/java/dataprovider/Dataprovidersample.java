package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovidersample 
{
	@Test(dataProvider = "getData")
	public void dataproviderdemo(String name,int price)
	{
		System.out.println("phone is "+name+" and price is"+price);
	}


@DataProvider
public Object[][] getData()
{
	
	Object[][] data=new Object[3][2];
	
data[0][0]="samsung";
data[0][1]=20000;

data[1][0]="iphone";
data[1][1]=25000;

data[2][0]="vivo";
data[2][1]=10000;

return data;
			

}
}