package iterface;

public abstract class Ex2 {
	/*
	 * Create a class as abstract without including any abstract methods and
	 * verify that you cannot create any instances of that class.
	 */

	private int x;

	private int nonAbstractMethod() {
		System.out.print("ooops");
		return 7;
	}

	public Ex2() {
		this.x = 7;
	}
}
