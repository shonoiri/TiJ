package ex25;

/*Exercise 25: (2) Create two interfaces and a class that implements both. Create two
generic methods, one whose argument parameter is bounded by the first interface and one
whose argument parameter is bounded by the second interface. Create an instance of the
class that implements both interfaces, and show that it can be used with both generic
methods.*/

public class MyClass implements MyInterface1, MyInterface2 {

	@Override
	public void c() {
		System.out.println("MyInterface2, c();");

	}

	@Override
	public void d() {
		System.out.println("MyInterface2, d();");

	}

	@Override
	public void a() {
		System.out.println("MyInterface1, a();");

	}

	@Override
	public void b() {
		System.out.println("MyInterface1, b();");

	}

}
