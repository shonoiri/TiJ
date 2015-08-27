package ex26;

/*Exercise 26: (2) Demonstrate array covariance using Numbers and Integers.*/

public class MyClass {
	public static void main(String[] args) {
		Number[] numbers = new Integer[10];
		numbers[0] = Integer.valueOf(10);
		try {
			numbers[1] = new Float(11.5);
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			numbers[2] = new Byte((byte) 1);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
