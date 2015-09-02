package ex12;

import java.util.Arrays;

import net.mindview.util.ConvertTo;
import net.mindview.util.CountingGenerator;
import net.mindview.util.Generated;

/*Exercise 12: (1) Create an initialized array of double using CountingGenerator. Print
the results.*/

public class Ex12 {

	public static void main(String[] args) {
		double[] arDb = ConvertTo.primitive(Generated.array(Double.class, new CountingGenerator.Double(), 15));
		System.out.println(Arrays.toString(arDb));
	}

}
