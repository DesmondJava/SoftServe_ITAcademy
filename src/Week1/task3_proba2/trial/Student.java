package Week1.task3_proba2.trial;

public class Student implements Comparable {
	public int id;
	public String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// @Override
	// public int compareTo(Object obj) {
	// Student tmp = (Student) obj;
	// if (this.id < tmp.id) {
	// return -1;
	// } else if (this.id > tmp.id) {
	// return 1;
	// }
	// return 0;
	// }

	@Override
	public int compareTo(Object obj) {
		Student tmp = (Student) obj;
		return this.name.compareTo(tmp.name);
	}

}
