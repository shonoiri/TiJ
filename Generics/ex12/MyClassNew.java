package ex12;

/*Exercise 12: (1) Repeat the previous exercise using explicit type specification.*/

import java.util.*;
import net.mindview.util.New;
import ex3.SixTuple;
import ex4.Sequence;

public class MyClassNew {
	static void f(List<SixTuple<Byte, Short, String, Float, Double, Integer>> l) {
		l.add(new SixTuple<Byte, Short, String, Float, Double, Integer>((byte) 1, (short) 1, "A", 1.0F, 1.0, 1));
		System.out.println(l);
	}

	static void g(Set<Sequence<String>> s) {
		s.add(new Sequence<String>(5));
		System.out.println(s);
	}

	public static void main(String[] args) {
		f(New.<SixTuple<Byte, Short, String, Float, Double, Integer>> list());
		g(New.<Sequence<String>> set());
	}

}
