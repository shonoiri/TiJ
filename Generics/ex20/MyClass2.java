package ex20;

public class MyClass2 {

	static <T extends MyClass> void f(T x) {
		x.method1();
		x.method2();
		x.method3();
		System.out.println("genericMethod");
	}

	public static void main(String[] args) {
		f(new MyClass());
	}
}
