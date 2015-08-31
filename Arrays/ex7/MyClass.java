package ex7;

/*Exercise 7: (1) Repeat the previous exercise for a 3-D array.*/

import java.util.Arrays;
import arrays.BerylliumSphere;

public class MyClass {
	static BerylliumSphere[][][] method(int a, int b, int c) {
		BerylliumSphere[][][] ba = new BerylliumSphere[a][b][c];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				for (int j2 = 0; j2 < c; j2++) {
					ba[i][j][j2] = new BerylliumSphere();
				}
			}
		}
		return ba;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(method(3, 5, 2)));

	}
}
