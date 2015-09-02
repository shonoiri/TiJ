package ex8;

import java.util.Arrays;

import typeinfo.pets.Integer;

public class Ex8 {

	public static void main(String[] args) {
		Object[] array = new Object[10];
		array[0] = new String("String");
		array[1] = new Integer("2");
		array[2] = new Boolean(false);
		System.out.println(Arrays.toString(array));
		Object[] array1 = new String[5];
		// arra1[0] = new java.lang.Integer(5);
		array1[0] = "StringString";
		System.out.println(Arrays.toString(array1));
	}

}
