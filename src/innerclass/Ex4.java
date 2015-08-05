package innerclass;

/*
Exercise 4: (2) Add a method to the class Sequence.SequenceSelector that produces
the reference to the outer class Sequence.*/

interface Selector {
	boolean end();

	Object current();

	void next();
}

public class Ex4 {
	private Object[] items;
	private int next = 0;

	public Ex4(int size) {
		items = new Object[size];
	}

	public void add(Object x) {
		if (next < items.length)
			items[next++] = x;
	}

	private class SequenceSelector implements Selector {
		private int i = 0;

		public boolean end() {
			return i == items.length;
		}
		
		public Ex4 method(){
			return  Ex4.this;
		}

		public Object current() {
			return items[i];
		}

		public void next() {
			if (i < items.length)
				i++;
		}
	}

	public Selector selector() {
		return new SequenceSelector();
	}

	public static void main(String[] args) {
		Ex4 sequence = new Ex4(10);
		for (int i = 0; i < 10; i++)
			sequence.add(Integer.toString(i));
		Selector selector = sequence.selector();
		while (!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}
} /*
	 * Output: 0 1 2 3 4 5 6 7 8 9
	 */// :~