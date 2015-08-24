package ex08;

public class TheGuy {
	private static long counter = 0;
	private final long id = counter++;

	public String toString() {
	    return getClass().getSimpleName() + " " + id;
	}
}
