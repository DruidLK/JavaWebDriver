package testNgSTuff.groups;

import org.testng.annotations.Test;

public class FirstTestGrouping {

	@Test(groups= {"smoke"})
	public void Test1() {
		System.out.println("test 1");
	}
	
	@Test(groups= {"smoke", "functional"})
	public void Test2() {
		System.out.println("test 2");
	}
	
	@Test(groups = {"functional", "regression", "smoke", "sanity"})
	public void Test3() {
		System.out.println("test 3");
	}
}
