package excel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadData {
	@Test
	public void read() throws Exception {
		String path="./xlsheet/Data.xlsx";
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		/*Sheet s=wb.getSheet("animal");
		Row r=s.getRow(0);
		Cell c=r.getCell(0);
		String data = c.toString();*/
		String data=wb.getSheet("animal").getRow(1).getCell(0).toString();
		System.out.println(data);
	}

}
