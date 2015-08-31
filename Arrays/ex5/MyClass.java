package ex5;

/*Exercise 5: (1) Demonstrate that multidimensional arrays of nonprimitive types are
automatically initialized to null.*/

import java.util.Arrays;
import typeinfo.pets.Integer;

public class MyClass {

	public static void main(String[] args) {
		Integer[][] test = new Integer[5][6];
		System.out.println(Arrays.deepToString(test));
	}

}
