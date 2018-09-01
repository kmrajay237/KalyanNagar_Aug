package excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class WriteData {
	@Test
	public void write() throws Exception {
		String path="./xlsheet/Data.xlsx";
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		Cell c=wb.getSheet("animal").getRow(5).createCell(1);
		c.setCellType(CellType.STRING);
		c.setCellValue("Automation");
		FileOutputStream fos=new FileOutputStream(path);
		wb.write(fos);
	}

}
