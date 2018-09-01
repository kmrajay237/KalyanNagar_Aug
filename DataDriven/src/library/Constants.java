package library;

public interface Constants {
	String path="./Xlsheet/Data.xlsx";
	
	String Chrome_Key=Excel.readExcelData(path,"data",0,0);
	String Chrome_Value=Excel.readExcelData(path,"data",0,1);
	
	String Gecko_Key=Excel.readExcelData(path,"data",1,0);
	String Gecko_Value=Excel.readExcelData(path,"data",1,1);
	
	String URL="https://www.google.co.in/";

}
