package glibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class proprtyHelper {
	
	public String getPropertyValue(String key) throws IOException{
	
		Properties prop = new Properties();
		
		FileInputStream fs = new FileInputStream("C:\\Users\\chethan\\eclipse-workspace\\Home\\src\\main\\java\\glibrary\\config.properties");
		
		prop.load(fs);
		
		return prop.getProperty(key);
		
	}

}
