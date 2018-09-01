package objectRepo;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadDataFromConfigFile {
	@Test
	public void Read() throws Exception {
		File file=new File("./Configuration/Config.properties");
		FileInputStream fis=new FileInputStream(file);
		Properties pro=new Properties();
		pro.load(fis);
		String data1 = pro.getProperty("Chrome_Key");
		System.out.println(data1);
		String data2 = pro.getProperty("Chrome_Value");
		System.out.println(data2);
	}
}
