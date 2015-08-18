package ex6;

/*Exercise 6: (1) Use RandomList with two more types in addition to the one shown in
main( ).*/

import java.util.*;

public class MyRandomList<T> {
	private ArrayList<T> storage = new ArrayList<T>();
	private Random rand = new Random(47);

	public void add(T item) {
		storage.add(item);
	}

	public T select() {
		return storage.get(rand.nextInt(storage.size()));
	}

	public static void main(String[] args) {
		MyRandomList<String> rs = new MyRandomList<String>();
		for (String s : ("The quick brown fox jumped over " + "the lazy brown dog").split(" "))
			rs.add(s);
		for (int i = 0; i < 11; i++)
			System.out.print(rs.select() + " ");
		System.out.println();
		
		MyRandomList<Character> rc = new MyRandomList<Character>();
		char[] a = ("Chto-to sluchilos' no nam nichego ne skazali").concat(" ").toCharArray();
		for (int i = 0; i < a.length; i++) {
			rc.add(a[i]);
		}
		for (int i = 0; i < 11; i++)
			System.out.print(rc.select() + " ");
		System.out.println();
		
		MyRandomList<Integer> ir = new MyRandomList<Integer>();
		for (int i = 0; i < 10; i++) {
			ir.add(i);
		}
		for (int i = 0; i < 11; i++)
			System.out.print(ir.select() + " ");
	}
}