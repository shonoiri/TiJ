package innerclass;

/*Exercise 1: (1) Write a class named Outer that contains an inner class named Inner.
Add a method to Outer that returns an object of type Inner. In main( ), create and
initialize a reference to an Inner.
*/
public class Ex1 {
	public static void main(String [] args){
		Ex1 ex1 = new Ex1();
		Outer outer = ex1.new Outer();
		outer.getInner();
	}


 private class Outer{
	 public Inner getInner(){
		 Inner inner = new Inner();
		 return inner;
	 }
	private class Inner{
		 
	 }
 }
}