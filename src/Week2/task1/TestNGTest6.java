package Week2.task1;

import org.testng.annotations.*;

public class TestNGTest6 {
	@Test
	@Parameters(value = "number")
	public void parameterIntTest(int number) {
		System.out.println("***Parameterized Number is: " + number);
	}
}