package ex27;

import java.util.ArrayList;
import java.util.List;

/*Exercise 27: (2) Show that covariance doesn’t work with Lists, using Numbers and
Integers, then introduce wildcards.*/

public class MyClass {
	public static void main(String[] args) {
		//List<Integer> list = new ArrayList<Number>();
		//List<Number> list1 = new ArrayList<Integer>();
		List<? extends Number> list = new ArrayList<Integer>();
		List<? super Integer> list1 = new ArrayList<Number>();
/*		list.add(new Integer(10));
		list.add(new Float(10));*/
		//list1.add(new Float(10));
	}

}
