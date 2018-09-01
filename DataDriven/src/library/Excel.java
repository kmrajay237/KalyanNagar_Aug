package library;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static String readExcelData(String path,String sheet,int row,int col) {
		String data="";
		try {
			FileInputStream fis=new FileInputStream(path);
			Workbook wb=WorkbookFactory.create(fis);
			data=wb.getSheet(sheet).getRow(row).getCell(col).toString();
		} catch (Exception e) {
			System.out.println("Exception Caught");
		}
		
		return data;
		
	}

}
