package Week1.task2_proba1.add;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Appl {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = 1;
		boolean simple = true;
		try {
			System.out.print("x=");
			x = Integer.parseInt(br.readLine()); // =Float.parseFloat(�);
		} catch (Exception e) { // NumberFormatException
			System.out.println("I/O Error.");
		}
		System.out.println("\nAll digits:");
		x = Math.abs(x);
		while (x > 0) {
			System.out.print("Next digit:" + (x % 10));
			x = x / 10;
			System.out.println("\t new x:" + x );
		}
	}
}
