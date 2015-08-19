package ex3;

public class MySixTupleTest {

	static SixTuple<String, String, String, String, String, String> test() {
		return new SixTuple<String, String, String, String, String, String>("11", "String", "C", "2", "5", "3");
	}

	public static void main(String[] args) {
		System.out.println(test());
	}
}
