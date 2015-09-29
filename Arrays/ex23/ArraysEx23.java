package ex23;

import java.util.Arrays;
import java.util.Collections;

import net.mindview.util.Generated;
import net.mindview.util.Generator;
import net.mindview.util.RandomGenerator;

/*Exercise 23: (2) Create an array of Integer, fill it with random int values (using
autoboxing), and sort it into reverse order using a Comparator.*/

public class ArraysEx23 {

	public static void main(String[] args) {
		Generator<Integer> gen = new RandomGenerator.Integer(500);
		Integer[] aI = Generated.array(new Integer[12], gen);
		System.out.println(Arrays.toString(aI));
		Arrays.sort(aI, Collections.reverseOrder());
		System.out.println(Arrays.toString(aI));
		Arrays.sort(aI);
		System.out.println(Arrays.toString(aI));
	}
}
