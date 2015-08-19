package ex4;

import ex4.Sequence;

public class Ex4 {

	public static void main(String[] args) {
		Sequence<String> sequence = new Sequence<String>(10);
		for (int i = 0; i < 10; i++)
			sequence.add(Integer.toString(i));
		Selector<String> selector = sequence.selector();
		while (!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}
}
