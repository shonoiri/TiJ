package ex18;
/*Exercise 18: (3) Create and fill an array of BerylliumSphere. Copy this array to a new
array and show that it’s a shallow copy.*/

import java.util.Arrays;

import arrays.BerylliumSphere;

public class Ex18 {
	public static void main(String[] args) {
		BerylliumSphere[] array = new BerylliumSphere[9];
		Arrays.fill(array, new BerylliumSphere());
		System.out.println(Arrays.toString(array));
		BerylliumSphere[] newArray = new BerylliumSphere[16];
		Arrays.fill(newArray, new BerylliumSphere());
		System.out.println(Arrays.toString(newArray));
		System.arraycopy(array, 0, newArray, 0, 9);
		System.out.println(Arrays.toString(newArray));
	}
}
