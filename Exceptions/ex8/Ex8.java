package ex8;

import ex4.MyException;

/*Exercise 8: (1) Write a class with a method that throws an exception of the type created
in Exercise 4. Try compiling it without an exception specification to see what the compiler
says. Add the appropriate exception specification. Try out your class and its exception inside
a try-catch clause.*/

public class Ex8 {

	private static void method(int[] a) throws MyException {
		System.out.println(a[5]);
		throw new MyException("String");
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		try {
			method(a);
		} catch (MyException e) {
			System.out.println(e.getMessage());
			e.print();
		}
	}
}
