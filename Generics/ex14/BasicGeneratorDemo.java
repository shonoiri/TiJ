package ex14;

/*Exercise 14: (1) Modify BasicGeneratorDemo.java to use the explicit form of
creation for the Generator (that is, use the explicit constructor instead of the generic
create( ) method).*/

import generics.CountedObject;
import net.mindview.util.BasicGenerator;
import net.mindview.util.Generator;

public class BasicGeneratorDemo {
	public static void main(String[] args) {
		Generator<CountedObject> gen = new BasicGenerator<CountedObject>(CountedObject.class);
		for (int i = 0; i < 5; i++)
			System.out.println(gen.next());
	}
}
