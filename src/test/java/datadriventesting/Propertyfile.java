package datadriventesting;

import java.io.FileInputStream;
import java.util.Properties;


public class Propertyfile {

	public static void main(String[] args) throws Throwable
	{
		
      // step 1 open the file in java readableformat
		
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		
		// step 2 create an object of property class
		Properties p= new Properties();
		
		//step 3 load the file input stream to properties
		p.load(fis);
		
		//step4 use the key to get the value
		String value = p.getProperty("username");
		
		//step 5 print the value of username
		System.out.println(value);
		}

	

}
