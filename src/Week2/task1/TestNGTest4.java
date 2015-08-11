package Week2.task1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNGTest4 {
	@Test(timeOut = 1000)
	public void infinity() {
		while (true) {
			System.out.println("Time="
					+ new Long(System.currentTimeMillis()).toString());
		}
	}
}
