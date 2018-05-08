package itheima.com;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class fhfhf {

	public static  String getelmt(String key) throws IOException{
		
		InputStream inputStream = fhfhf.class.getResourceAsStream("/ma.properties");
		Properties prop = new Properties();
		prop.load(inputStream);
		 
		return  prop.getProperty(key);
	}
	
}
