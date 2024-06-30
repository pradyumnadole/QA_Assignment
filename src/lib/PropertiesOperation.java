package lib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesOperation {

	public static String filename1= "src/config/config.properties";
	static String value = null;
	
	public static String getValue (String PropName) throws IOException {
		
		FileInputStream fi = new FileInputStream(filename1);
		Properties properties = new Properties();
		properties.load(fi);
		fi.close();
		
		try {
			value = properties.getProperty(PropName);
			
			if (value == null || value.equals("")) {
				System.out.println("The value for key: " +  PropName + " doesn't exist.");
				System.out.println("Please check the content of the properties file.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		properties.getProperty(PropName);
		return value;
		
	}
	
}
