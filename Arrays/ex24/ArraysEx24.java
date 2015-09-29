package ex24;

import java.util.Arrays;
import java.util.Comparator;

import ex19.MyClass;
import ex19.NewMyClass;

import static net.mindview.util.Print.*;

/*Exercise 24: (3) Show that the class from Exercise 19 can be searched.*/

public class ArraysEx24 {
	public static void main(String[] args) {
		Comparator<MyClass> comp = new Comparator<MyClass>() {
			public int compare(MyClass o1, MyClass o2) {
				return (o1.i < o2.i ? -1 : (o1.i== o2.i ? 0 : 1));
			}
		};
		MyClass[] a = new NewMyClass(10);
		for (int i = 0; i < a.length; i++)
			a[i] = new NewMyClass(i);
		Arrays.sort(a, comp);
		int location = Arrays.binarySearch(a, a[7], comp);
		printnb("Location of " + a[7] + " is " + location);
		if (location >= 0)
			print(", a[" + location + "] = " + a[location]);
		else
			print();
		location = Arrays.binarySearch(a, a[5], comp);
		printnb("Location of " + a[5] + " is " + location);
		if (location >= 0)
			print(", a[" + location + "] = " + a[location]);
	}
}
