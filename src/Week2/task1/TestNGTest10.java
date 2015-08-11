package Week2.task1;

import org.testng.annotations.*;

public class TestNGTest10 {
	@Test
	public void method1() {
		System.out.println("This is method 1");
		//throw new RuntimeException("Error");
	}

	@Test(dependsOnMethods = { "method1" })
	public void method2() {
		System.out.println("This is method 2");
		throw new RuntimeException("Error");
	}

	@Test(dependsOnMethods = { "method2" })
	public void method3() {
		System.out.println("This is method 3");
	}
}
