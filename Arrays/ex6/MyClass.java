package ex6;

/*Exercise 6: (1) Write a method that takes two int arguments, indicating the two sizes of
a 2-D array. The method should create and fill a 2-D array of BerylliumSphere according
to the size arguments.*/

import java.util.Arrays;
import arrays.BerylliumSphere;

public class MyClass {
	static BerylliumSphere[][] method(int a, int b) {
		BerylliumSphere[][] ba = new BerylliumSphere[a][b];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				ba[i][j] = new BerylliumSphere();
			}
		}
		return ba;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(method(3, 5)));

	}

}
