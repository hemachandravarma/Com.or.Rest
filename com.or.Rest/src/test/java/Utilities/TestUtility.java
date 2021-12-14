package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class TestUtility {
	public static String getValueInPropertiesFile(String Propertyname) throws Exception {
		String pfpath=System.getProperty("user.dir")
				+"\\src\\test\\resources\\config.properties";
		FileInputStream fi=new FileInputStream(pfpath);
		Properties p=new Properties();
		p.load(fi);
		String value=p.getProperty(Propertyname);
		fi.close();
		return (value);	
	}
}
