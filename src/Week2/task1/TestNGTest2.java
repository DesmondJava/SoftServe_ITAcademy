package Week2.task1;

import org.testng.annotations.Test;
import org.testng.annotations.*;

public class TestNGTest2 {
	@Test(groups = "method1", expectedExceptions = ArithmeticException.class)
	public void divisionWithException() {
		int i = 1 / 0;
	}
}
