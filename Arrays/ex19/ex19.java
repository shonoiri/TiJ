package ex19;

import java.util.Arrays;

public class ex19 {

	public static void main(String[] args) {
		MyClass [] array = new MyClass[9];
		MyClass[] array2 = new MyClass[9];
		Arrays.fill(array, new MyClass(3));
		Arrays.fill(array2, new MyClass(3));
		System.out.println(Arrays.equals(array, array2));
		Arrays.fill(array, new NewMyClass(1));
		Arrays.fill(array2, new NewMyClass(1));
		System.out.println(Arrays.equals(array, array2));
		
	}

}
