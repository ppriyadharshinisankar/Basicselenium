package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheetwrite {

	public static void main(String[] args) throws Throwable 
	{
		//open the excel readable document
				FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\TESTDATA.xlsx");
				
				//create a workbook
				Workbook wb= WorkbookFactory.create(fis);
				
				//navigate to the sheet
				Sheet sheet = wb.createSheet("Trial");
				
				//navigate to the row
				Row row = sheet.createRow(2);
				
				//navigate to the cell
				Cell cell = row.createCell(1);
				
				   cell.setCellValue("Priya");
				   
				   FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\TESTDATA.xlsx");
				 //create a workbook
					wb.write(fos);
					System.out.println("data addded");
				

	}

}
