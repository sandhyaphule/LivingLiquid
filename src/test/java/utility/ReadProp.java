package utility;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProp 
{
	public static String getPropData(String key) throws IOException
	{
String path = System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\config.properties";
		
		File file = new File(path);
		
		FileInputStream fis = new FileInputStream(file);
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String value = prop.getProperty(key);
		
		System.out.println(value);
		
		return value;
	}
}