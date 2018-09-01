package objectRepo;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	Properties pro;

	public ConfigReader() {
		try {
			File file = new File("./Configuration/Config.properties");
			FileInputStream fis = new FileInputStream(file);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getKey() {
		String key = pro.getProperty("Chrome_Key");
		return key;
	}
	public String getValue() {
		String value=pro.getProperty("Chrome_Value");
		return value;
	}
	public String getURL() {
		String url=pro.getProperty("url");
		return url;
	}

}
