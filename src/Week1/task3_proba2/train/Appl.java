package Week1.task3_proba2.train;

public class Appl {
	public static void main(String[] args) {
		String text = "Hello World";
		Box box = new Box();
		box.set(text);
		Integer i = (Integer) box.get();
	}
}
