package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertiesreader {

	public static Properties p;

	public Propertiesreader() throws IOException {

		File f=new File("C:\\Users\\HP\\eclipse-workspace\\Maven_Demo_Project\\src\\main\\java\\base\\config.properties");

		FileInputStream fis=new FileInputStream(f);
		p=new Properties();
		p.load(fis);

	}

	public String geturl() {
		String file=p.getProperty("url");
		return file;

	}
	
	public String getusername() {
		String files=p.getProperty("username");
		return files;
	}
	
	public String getpassword() {
		String pass=p.getProperty("password");
		return pass;

	}
	
	
}
