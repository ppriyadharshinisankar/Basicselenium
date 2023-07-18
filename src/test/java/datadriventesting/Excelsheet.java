package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet {

	public static void main(String[] args) throws Throwable 
	{
		//open the excel readable document
		FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\TESTDATA.xlsx");
		
		//create a workbook
		Workbook wb= WorkbookFactory.create(fis);
		
		//navigate to the sheet
		
		Sheet sheet = wb.getSheet("sample");
		
		//navigate to row
		
		Row row = sheet.getRow(3);
		
		//navigate to cell
		Cell cell = row.getCell(0);
		
		//capture the data
		
		//double data = cell.getNumericCellValue();---this to return numeric value
		String data = cell.getStringCellValue();
		System.out.println(data);

}
}

