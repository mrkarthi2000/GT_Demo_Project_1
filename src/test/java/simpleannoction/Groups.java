package simpleannoction;

import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups = "Electronics")
	public void mobile() {
		System.out.println("mobile");
	}
	@Test(groups = "Electronics")
	public void laptop() {
		System.out.println("laptop");

	}
	@Test(groups = "Electronics")
	public void tv() {
		System.out.println("tv");
	}
	@Test(groups = "Education")
	public void navels() {
		System.out.println("navels");

	}
	@Test(groups = "Education")
	public void books() {
		System.out.println("books");
	}
	@Test(groups = "Education")
	public void kindle() {
		System.out.println("kindle");
		
	}
	@Test(groups = "games")
	public void football() {
		System.out.println("football");
	}
	@Test(groups = "games")
	public void cricket() {
		System.out.println("cricket");

	}
	@Test(groups = "games")
	public void basketball() {
		System.out.println("football");

	}

}