package excel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadAllData {
	@Test
	public void read() throws Exception {
		String path="./xlsheet/Data.xlsx";
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		String data="";
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				data=wb.getSheet("animal").getRow(i).getCell(j).toString();
				System.out.print(data+" ");
			}
			System.out.println();
		}
	}

}
