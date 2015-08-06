package Ex9;

/*Exercise 9: (1) Create an interface with at least one method, and implement that
interface by defining an inner class within a method, which returns a reference to your
interface.*/

public class Class {
	
	class Inner implements Interface{

		@Override
		public void method() {
			
		}		
	}
}

interface Interface{
	void method();
}