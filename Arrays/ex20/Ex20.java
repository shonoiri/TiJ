package ex20;

/*Exercise 20: (4) Demonstrate deepEquals( ) for multidimensional arrays.*/

import java.util.Arrays;

public class Ex20 {
	public static void main(String[] args) {
		Integer[][] array = new Integer[3][7];
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {
				array[j][i] = i;
			}
		}
		Integer[][] array2 = new Integer[3][7];
		for (int j = 0; j < array2.length; j++) {
			for (int i = 0; i < array2[j].length; i++) {
				array2[j][i] = i;
			}
		}
		System.out.println(Arrays.deepEquals(array, array2));

	}
}
