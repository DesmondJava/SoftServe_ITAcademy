package Week1.task2_proba1.trial;

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
		x = Math.abs(x);
		for (int i = 2; i < (new Double(Math.sqrt(x)) ).intValue(); i++) {
			if (x % i == 0) {
				simple = false;
				break;
			}
		}
		if (simple) {
			System.out.println("Simple");
		} else {
			System.out.println("NOT Simple");
		}
	}
}
