package ex23;

public class IntegerFactory implements FactoryI<Integer> {
	public Integer create(int arg) {
		return new Integer(0);
	}
}