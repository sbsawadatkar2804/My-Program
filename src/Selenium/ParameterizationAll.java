package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ParameterizationAll {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\admin\\Desktop\\Java Files\\TestCase.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		
		for(int i=0;i<=sh.getLastRowNum();i++) {
			
			for(int j=0;j<=sh.getRow(i).getLastCellNum()-1;j++) {
				
				Cell data = sh.getRow(i).getCell(j);
				
				CellType type = data.getCellType();
				
				if(type==CellType.STRING) {
					
					System.out.print(data.getStringCellValue()+" ");
				}
				else if (type==CellType.NUMERIC) {
					
					System.out.print(data.getNumericCellValue()+" ");
				}
				else if (type==CellType.BOOLEAN) {
					
					System.out.print(data.getBooleanCellValue()+" ");
				}
				
			}
			System.out.println();
		}
		
	}

}
