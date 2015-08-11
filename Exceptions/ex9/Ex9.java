package ex9;

/*Exercise 9: (2) Create three new types of exceptions. Write a class with a method that
throws all three. In main( ), call the method but only use a single catch clause that will
catch all three types of exceptions.*/
class ExBase extends Exception {
}

class MyException1 extends ExBase {
	String string;

	public MyException1(String str) {
		this.string = str;
	}

	public void print() {
		System.out.println("msg " + string);
	}
}

class MyException2 extends ExBase {
	String string;

	public MyException2(String str) {
		this.string = str;
	}

	public void print() {
		System.out.println("msg " + string);
	}
}

class MyException3 extends ExBase {
	String string;

	public MyException3(String str) {
		this.string = str;
	}

	public void print() {
		System.out.println("msg " + string);
	}
}

public class Ex9 {

	public static void method() throws MyException1, MyException2, MyException3 {
		System.out.println("Method ");
		throw new MyException1("MyException1");
	}

	public static void main(String[] args) {
		try {
			method();
		} catch (ExBase exBase) {
			System.out.println("caught " + exBase);
		}
	}
}
