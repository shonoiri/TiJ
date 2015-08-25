package ex23;

/*Exercise 23: ( 1) Modify FactoryConstraint.java so that create( ) takes an
argument.*/

public class FactoryConstraint {
	public static void main(String[] args) {
		new Foo<Integer>(new IntegerFactory());
		new Foo<Widget>(new Widget.Factory());
	}
}