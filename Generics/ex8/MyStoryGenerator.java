package ex8;

/*Exercise 8: (2) Following the form of the Coffee example, create a hierarchy of
StoryCharacters from your favorite movie, dividing them into GoodGuys and BadGuys.
Create a generator for StoryCharacters, following the form of CoffeeGenerator.
*/
import java.util.Iterator;
import java.util.Random;

import net.mindview.util.Generator;

public class MyStoryGenerator implements Generator<TheGuy>, Iterable<TheGuy> {
	@SuppressWarnings("rawtypes")
	private Class[] classes = { Sauron.class, BilboBeggins.class, FrodoBeggins.class, Golum.class };
	private static Random rand = new Random(47);

	public MyStoryGenerator() {
	}

	private int size = 0;

	public MyStoryGenerator(int size) {
		this.size = size;
	}

	@Override
	public TheGuy next() {
		try {
			return (TheGuy) classes[rand.nextInt(classes.length)].newInstance();
			// Report programmer errors at run time:
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	class MyStoryIterator implements Iterator<TheGuy> {
		int count = size;

		public boolean hasNext() {
			return count > 0;
		}

		public TheGuy next() {
			count--;
			return MyStoryGenerator.this.next();
		}

		public void remove() { // Not implemented
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public Iterator<TheGuy> iterator() {
		return new MyStoryIterator();
	}

	public static void main(String[] args) {
		MyStoryGenerator gen = new MyStoryGenerator();
		for (int i = 0; i < 5; i++)
			System.out.println(gen.next());
		for (TheGuy c : new MyStoryGenerator(5))
			System.out.println(c);
	}

}
