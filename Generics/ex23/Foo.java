package ex23;

public class Foo<T> {
	private T x;

	public Foo(FactoryI<T> factory) {
		x = factory.create(1);
	}
	// ...
}