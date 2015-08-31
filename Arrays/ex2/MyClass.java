package ex2;

/*Exercise 2: (1) Write a method that takes an int argument and returns an array of that
size, filled with BerylliumSphere objects.*/

import java.util.Arrays;
import arrays.BerylliumSphere;

public class MyClass {

	private static BerylliumSphere[] myMethod(int n) {
		BerylliumSphere[] result = new BerylliumSphere[n];
		for (int i = 0; i < n; i++) {
			result[i] = new BerylliumSphere();
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(myMethod(7)));
	}
}
