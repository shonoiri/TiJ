package ex28;

/*Exercise 28: (4) Create a generic class Generic1<T> with a single method that takes an
argument of type T. Create a second generic class Generic2<T> with a single method that
returns an argument of type T. Write a generic method with a contravariant argument of the first
generic class that calls its method. Write a second generic method with a covariant argument of
the second generic class that calls its method. Test using the typeinfo.pets library.*/

public class Generic1<T> {
	public void methodG1(T x) {
		System.out.println("Generic1");
	}
}
