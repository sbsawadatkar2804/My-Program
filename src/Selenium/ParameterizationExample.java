package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ParameterizationExample {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream File = new FileInputStream("C:\\Users\\admin\\Desktop\\Java Files\\TestCase.xlsx");
		
		Sheet sh = WorkbookFactory.create(File).getSheet("Sheet3");
		
		for(int r=0;r<=sh.getLastRowNum();r++) {
			for(int c=0; c<=sh.getRow(r).getLastCellNum()-1;c++) {
				
				Cell cellinfo = sh.getRow(r).getCell(c);
				
				CellType type = cellinfo.getCellType();
				
				if(type == CellType.BOOLEAN) {
					System.out.print(cellinfo.getBooleanCellValue()+"   ");
				}
				else if(type== CellType.STRING) {
					System.out.print(cellinfo.getStringCellValue()+"   ");
				}
				else if(type==CellType.NUMERIC) {
					System.out.print(cellinfo.getNumericCellValue()+"      ");
				}
			}
			System.out.println();
		}
		
	}

}
