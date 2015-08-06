package Week1.task3_proba2.training;

public class Appl {
	public static void main(String[] args) {
		String text = "11a";
		Box<String> box = new Box<String>();
		box.set(text);
		try {
			Integer i = Integer.parseInt(box.get());
			System.out.println("i=" + i);
		} catch (Exception e) {
			// TODO
			System.out.println("Error in text e="+e.getMessage());
		}
	}
}
