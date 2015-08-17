package ex2;

/*Exercise 2: (1) Create a holder class that holds three objects of the same type, along with
the methods to store and fetch those objects and a constructor to initialize all three.*/

class MyHolder<T> {
	private T value, value1, value2;

	public MyHolder() {
	}

	public MyHolder(T val, T val1, T val2) {
		value = val;
		value1 = val1;
		value2 = val2;
	}

	public T getValue1() {
		return value1;
	}

	public void setValue1(T value1) {
		this.value1 = value1;
	}

	public T getValue2() {
		return value2;
	}

	public void setValue2(T value2) {
		this.value2 = value2;
	}

	public void set(T val) {
		value = val;
	}

	public T get() {
		return value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

}

public class Ex2 {

	public static void main(String[] args) {

		MyHolder<String> holder = new MyHolder<String>("A", "B", "C");
		System.out.println(holder.getValue());
		System.out.println(holder.getValue1());
		System.out.println(holder.getValue2());

	}

}
