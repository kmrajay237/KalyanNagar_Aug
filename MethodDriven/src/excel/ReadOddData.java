package excel;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadOddData {
	@Test
	public void Read() throws Exception {
		String path="./xlsheet/Data.xlsx";
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		String data="";
		int rows=wb.getSheet("animal").getLastRowNum();
		for (int i = 0; i <=rows; i++) {
			for (int j = 0; j < wb.getSheet("animal").getRow(i).getLastCellNum(); j++) {
				data=wb.getSheet("animal").getRow(i).getCell(j).toString();
				System.out.print(data+" ");
			}
			System.out.println();
		}
	}

}
