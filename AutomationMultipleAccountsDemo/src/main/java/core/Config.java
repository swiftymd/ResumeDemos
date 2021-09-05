package core;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Config {

	private static Properties prop;
	
	public static void loadProperty(String env) {
		try {
			String fileLocation = System.getProperty("user.dir")+"//src//main//resources//config//config."+env.toLowerCase()+".properties";
			FileInputStream fis = new FileInputStream(new File(fileLocation));
			prop = new Properties();
			prop.load(fis);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String property) {
		if(prop.containsKey(property)) {
			return prop.getProperty(property);
		}
		return null;
	}
	
}
