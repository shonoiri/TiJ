package ex3;

import net.mindview.util.*;

class SixTuple<A, B, C, D, E, F> extends FiveTuple<A, B, C, D, E> {
	public final F f;

	public SixTuple(A a, B b, C c, D d, E e, F f) {
		super(a, b, c, d, e);
		this.f = f;
	}
}

public class MySixTupleTest {

	static SixTuple<String, String, String, String, String, String> test() {
		return new SixTuple<String, String, String, String, String, String>("11", "String", "C", "2", "5", "3");
	}

	public static void main(String[] args) {
		System.out.println(test());
	}
}
