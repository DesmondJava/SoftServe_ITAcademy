package Week1.task2_proba1.edu;

public class Appl {
	public static void main(String[] args) {
		Longer longer = new Longer("12345");
		System.out.println("Result:" + longer.getS());
		//
		int num = 1;
		double data = 11.123;
		System.out.println("data 1 =" + data);
		data = num;
		System.out.println("data 2 =" + data);
		// num=data;
		data = 11.123;
		num=(int)data;
		System.out.println("num 3 =" + num);
		Double data2=data; // Double data2= new Double(data);
		num=data2.intValue();
		System.out.println("num 4 =" + num);
	}
}
