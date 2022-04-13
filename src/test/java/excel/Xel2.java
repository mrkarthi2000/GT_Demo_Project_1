package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xel2 {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\HP\\Desktop\\Data.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(1);
		Cell cell = row.getCell(0);
		
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(CellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}
		
		else if (cellType.equals(cellType.NUMERIC)) {
			double num = cell.getNumericCellValue();
			System.out.println(num);
		}
		
		int pn = sheetAt.getPhysicalNumberOfRows();
		System.out.println(pn);
		
		for (int i = 0; i <pn; i++) {
			Row row2 = sheetAt.getRow(i);
			int oc = row2.getPhysicalNumberOfCells();
			
		for (int j = 0; j < oc; j++) {
			Cell cell2 = row2.getCell(j);
			String stringCellValue = cell2.getStringCellValue();
			System.out.println(stringCellValue);
		}	
			
			
			
		}
		
		
		
	}

}
