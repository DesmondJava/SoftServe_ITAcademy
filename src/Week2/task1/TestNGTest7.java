package Week2.task1;

import java.util.Vector;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGTest7 {

	@Test(dataProvider = "Data-Provider-Function")
	public void parameterIntTest(Class clzz, String[] number) {
		System.out.println("Class is: " + clzz.getName());
		System.out.println("Parameterized Number is: " + number[0]);
		System.out.println("Parameterized Number is: " + number[1]);
		// throw new RuntimeException("Error");
	}

	// This function will provide the parameter data
	@DataProvider(name = "Data-Provider-Function")
	public Object[][] parameterIntTestProvider() {
		return new Object[][] {
				{
						Vector.class,
						new String[] { "java.util.AbstractList",
								"java.util.AbstractCollection" } },
				{ String.class, new String[] { "1", "2" } },
				{ Integer.class, new String[] { "3", "4" } } };
	}
}
