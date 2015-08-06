package innerclass;
/*Exercise 26: (2) Create a class with an inner class that has a non-default constructor
(one that takes arguments). Create a second class with an inner class that inherits from the
first inner class.*/
public class Ex26 {

private class Outer {
	private class Inner {
		public Inner(int par) {
			System.out.println("Inner class parametr " + par);
		}
	}
}

private class Outer2 {
	private class Inner2 extends Outer.Inner {

		public Inner2(Outer outer, int par) {
			outer.super(par);
		}
	}
}
}