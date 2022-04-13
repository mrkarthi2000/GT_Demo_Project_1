package base;

import java.io.IOException;

public class MainReader {
	
	//private
	private MainReader() {
	}
	
	
	//static 
	public static MainReader fileread() {
		MainReader obj=new MainReader();
		return obj;

	}
	
	//non static
	public Propertiesreader connection() throws IOException {
		Propertiesreader obj1=new Propertiesreader();
		return obj1;
	}}
	
	
	