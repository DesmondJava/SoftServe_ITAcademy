package Week1.task3_proba2.edu;

public class Appl {
	
	public void work(int i) {
		i = i + 1;
	}

	public void work(StringBuilder s) {
		s.append(" work added");
	}

	public static void main(String[] args) {
		int i = 1;
		StringBuilder s = new StringBuilder("123");
		Appl appl = new Appl();
		appl.work(i);
		appl.work(s);
		System.out.println("i=" + i + "\ns=" + s);
	}
}
