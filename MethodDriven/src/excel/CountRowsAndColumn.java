package excel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class CountRowsAndColumn {
	@Test
	public void Count() throws Exception {
		String path="./xlsheet/Data.xlsx";
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		int col=wb.getSheet("animal").getRow(0).getLastCellNum();
		int rows=wb.getSheet("animal").getPhysicalNumberOfRows();
		System.out.println("Number of columns: "+col);
		System.out.println("number of rows: "+rows);
	}

}
