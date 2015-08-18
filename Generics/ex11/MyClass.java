package ex11;

/*Exercise 11: (1) Test New.java by creating your own classes and ensuring that New will
work properly with them.*/

import java.util.List;
import java.util.Queue;

import net.mindview.util.New;
import net.mindview.util.ThreeTuple;
import net.mindview.util.TwoTuple;

public class MyClass {
	static {
		System.out.println("New MyClass object"); // just for fan
	}

	public static void main(String[] args) {
		List<TwoTuple<Float, Integer>> list = New.list();
		list.add(new TwoTuple<Float, Integer>(11.3F, 12));
		System.out.println(list.toString());
		Queue<ThreeTuple<Float, Character, String>> queue = New.queue();
		queue.add(new ThreeTuple<Float, Character, String>(12F, ' ', "D"));
		System.out.println(queue.toString());
	}

}
