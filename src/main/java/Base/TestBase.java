package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class TestBase {
	
	public static Properties prop;
	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/Config/config.properties");
			prop.load(ip);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getKey() {
	String password=prop.getProperty("key");
	return password;
	}

	public static String baseURI() {
		String URI=prop.getProperty("baseURI");
		return URI;
		}
	
	public static String getContentType() {
		String contenttype=prop.getProperty("Content-Type");
		return contenttype;
		}

}
