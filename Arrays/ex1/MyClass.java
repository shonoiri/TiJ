package ex1;

import arrays.BerylliumSphere;

/*Exercise 1: (2) Create a method that takes an array of BerylliumSphere as an
argument. Call the method, creating the argument dynamically. Demonstrate that ordinary
aggregate array initialization doesn’t work in this case. Discover the only situations where
ordinary aggregate array initialization works, and where dynamic aggregate initialization is
redundant.*/

public class MyClass {

	static void myMethod(BerylliumSphere[] sf) {
		System.out.println(sf.length);
	}

	public static void main(String[] args) {
		myMethod(new BerylliumSphere[] { new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere() });
		BerylliumSphere[] d = { new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere() };
		myMethod(d);
		BerylliumSphere[] a = new BerylliumSphere[] { new BerylliumSphere(), new BerylliumSphere() };
		myMethod(a);
	}

}
