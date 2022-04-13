package simpleannoction;

import org.testng.annotations.Test;

public class Dependsonmethods {
//	
//	@Test
//	public void mobileoffer() {
//		System.out.println("mobileoffer");
//	}
	@Test
	public void laptopoffer() {
		System.out.println("laptopoffer");
	}
	@Test(dependsOnMethods = "mobileoffer")
	public void aadioffer() {
		System.out.println("aadioffer");
	}
	
}
