package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\admin\\Desktop\\Java Files\\TestCase.xlsx");
		
	//double data = WorkbookFactory.create(file).getSheet("Sheet3").getRow(8).getCell(5).getNumericCellValue();
		
	//int data = WorkbookFactory.create(file).getSheet("Sheet2").getLastRowNum();
	
	//System.out.println(data);
		
	//short data = WorkbookFactory.create(file).getSheet("Sheet2").getRow(8).getLastCellNum();
	
	//System.out.println(data);
		
	//	boolean data = WorkbookFactory.create(file).getSheet("Sheet2").getRow(5).getCell(2).getBooleanCellValue();
		
	//	double data = WorkbookFactory.create(file).getSheet("Sheet2").getRow(3).getLastCellNum();
		
	//	int data = WorkbookFactory.create(file).getSheet("Sheet2").getLastRowNum();
	
		Sheet data = WorkbookFactory.create(file).getSheet("Sheet3");
		
		short cellsize = data.getRow(1).getLastCellNum();
		
	//	for(int i=0; i<=cellsize-1;i++) {
			
		//	String abc = data.getRow(1).getCell(i).getStringCellValue();
			
		//	System.out.print(abc+ " ");
		//}
		
		
		  for(int i =0; i<=data.getLastRowNum();i++) {
			
			for(int j=0; j<=data.getRow(i).getLastCellNum()-1;j++) {
				
				String date1 = data.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(date1 + " ");
				
			}
			
			System.out.println();
		}   
		
	}
	

}
