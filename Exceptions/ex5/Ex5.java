package ex5;

/*Exercise 5: (3) Create your own resumption-like behavior using a while loop that
repeats until an exception is no longer thrown.*/

public class Ex5 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int i = 15;
		while (true) {
			try {
				a[i] = 3 + i;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Caught " + e);
				continue;
			} finally {
				i = i - 1;
				if (i == 0)
					break;
			}
		}
	}
}
