package Ex7;

/*Exercise 7: (2) Create a class with a private field and a private method. Create an
inner class with a method that modifies the outer-class field and calls the outer-class method.
In a second outer-class method, create an object of the inner class and call its method, then
show the effect on the outer-class object.*/

public class Class {
	
	public static void main(String[] args) {
		Class2 cl = new Class2();
		Class2.Innter ooo = cl.new Innter();
		ooo.methodInner();
	}
}

class Class2 {
	private int field;

	private int method() {
		return 7;
	}

	class Innter {
		 void methodInner() {
			field = 12;
			int test = method();
		}
	}
}