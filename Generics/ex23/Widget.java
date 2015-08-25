package ex23;

public class Widget {
	private final int id;

	Widget(int ident) {
		id = ident;
	}

	public String toString() {
		return "Widget " + id;
	}

	public static class Factory implements FactoryI<Widget> {
		public Widget create(int arg) {
			return new Widget(arg);
		}
	}
}