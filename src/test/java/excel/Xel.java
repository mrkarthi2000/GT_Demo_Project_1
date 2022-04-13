package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xel {

	public static void main(String[] args) throws IOException {

		File f=new File("C:\\Users\\HP\\Desktop\\Data.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook();
		
		Sheet createSheet = wb.createSheet("Project");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Student");
		
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		
		
		
		
		
	}

}
