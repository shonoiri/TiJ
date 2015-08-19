package ex13;

/*Exercise 13: (4) Overload the fill( ) method so that the arguments and return types are
the specific subtypes of Collection: List, Queue and Set. This way, you don’t lose the type
of container. Can you overload to distinguish between List and LinkedList?
		*/

import generics.Fibonacci;
import generics.coffee.*;
import java.util.*;
import net.mindview.util.*;

public class Generators {

	public static <T> Set<T> fill(Set<T> set, Generator<T> gen, int n) {
		for (int i = 0; i < n; i++) {
			set.add(gen.next());
		}
		return set;
	}

	public static <T> List<T> fill(List<T> list, Generator<T> gen, int n) {
		for (int i = 0; i < n; i++) {
			list.add(gen.next());
		}
		return list;
	}

	public static <T> Queue<T> fill(Queue<T> que, Generator<T> gen, int n) {
		for (int i = 0; i < n; i++) {
			que.add(gen.next());
		}
		return que;
	}

	public static <T> LinkedList<T> fill(LinkedList<T> lklist, Generator<T> gen, int n) {
		for (int i = 0; i < n; i++) {
			lklist.add(gen.next());
		}
		return lklist;
	}

	public static void main(String[] args) {
		List<Coffee> coffeeList = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 8);
		for (Coffee c : coffeeList)
			System.out.print(c);
		System.out.println();
		Queue<Integer> integerQueue = fill((Queue<Integer>) new LinkedList<Integer>(), new Fibonacci(), 12);
		for (int i : integerQueue)
			System.out.print(i + " ");
		System.out.println();
		LinkedList<Character> charLinkedList = fill(new LinkedList<Character>(), new CountingGenerator.Character(), 13);
		for (char item : charLinkedList)
			System.out.print(item + " ");
		System.out.println();
		Set<Boolean> booleanSet = fill(new HashSet<Boolean>(), new CountingGenerator.Boolean(), 10);
		for (boolean item : booleanSet)
			System.out.print(item + " ");
	}
}