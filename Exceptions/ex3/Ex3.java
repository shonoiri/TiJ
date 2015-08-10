package ex3;

/*Exercise 3: (1) Write code to generate and catch an
ArraylndexOutOfBoundsException.*/



public class Ex3 {

	public static void main(String[] args) {
		int a[] = new int[3];
		try {
			System.out.println(a[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception : " + e);
		}
	}
}
