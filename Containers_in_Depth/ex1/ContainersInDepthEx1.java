package ex1;

import static net.mindview.util.Print.print;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import static net.mindview.util.Countries.*;

/*Exercise 1: (1) Create a List (try both ArrayList and LinkedList) and fill it using
Countries. Sort the list and print it, then apply Collections.shuffle( ) to the list
repeatedly, printing it each time so that you can see how the shuffle( ) method randomizes
the list differently each time.*/
public class ContainersInDepthEx1 {
	private static Random rnd = new Random(47);

	public static void main(String[] args) {
		//List<String> l = new LinkedList<String>(names(8));
		List<String> l = new ArrayList<String>(names(8));
		Collections.sort(l);
		print("sorted: " + l);
		for (int i = 1; i < 5; i++) {
			Collections.shuffle(l, rnd);
			print("shuffled (" + i + "): " + l);
		}
	}
}
