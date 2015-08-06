package Week1.task3_proba2.training;

public class Box<T> {
	// T stands for "Type".
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}
