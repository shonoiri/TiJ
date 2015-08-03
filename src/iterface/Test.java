package iterface;

public class Test {
/*	
 * Exercise 2
	public static void main(String [] args){
		Ex2 ex = new Ex2();
	}
*/
	//Exercise 3
	public static void main(String [] args){
		Ex3_1 ex = new Ex3_1();
		ex.print();
		/* result : 07
		*  Process of initialization:
		* 1. Storage for Ex3 s allocated and initialized to binary zero
		* 2. Ex3() called
		* 3. Ex3_1.print() called in Ex3() (s.i = 0)
		* 4. Member initializers called in order (s.i = 1)
		* 5. Body of Son() called
		*/
	}
}
