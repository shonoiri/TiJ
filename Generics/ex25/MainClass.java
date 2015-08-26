package ex25;

public class MainClass {

	static <T extends MyInterface1> void method1(T x) {
		x.a();
		x.b();
	}

	static <T extends MyInterface2> void method2(T x) {
		x.c();
		x.d();
	}

	public static void main(String[] args) {
		MyClass myObj = new MyClass();
		method1(myObj);
		method2(myObj);
	}

}
