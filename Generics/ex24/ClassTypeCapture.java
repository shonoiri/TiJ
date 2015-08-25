package ex24;

import static net.mindview.util.Print.print;
import java.util.HashMap;
import java.util.Map;
import ex23.FactoryI;
import ex23.IntegerFactory;
import ex23.Widget;

/*Exercise 24: (3) Modify Exercise 21 so that factory objects are held in the Map instead
of Class<?>.*/

class Building {
}

class House extends Building {
}

public class ClassTypeCapture<T> {
	FactoryI<T> kind;
	Map<String, FactoryI<?>> types = new HashMap<String, FactoryI<?>>();

	void addType(String typename, FactoryI<?> kind) {
		types.put(typename, kind);
	}

	Object createNew(String typename, int arg) {
		FactoryI<?> cl = types.get(typename);
		try {
			return cl.create(arg);
		} catch (NullPointerException e) {
			System.out.println("Not a registered typename: " + typename);
		} catch (Exception e) {
			print(e.toString());
		}
		return null;
	}

	public static void main(String[] args) {
		ClassTypeCapture ctt = new ClassTypeCapture();
		ctt.addType("Widget", new Widget.Factory());
		ctt.addType("Integer", new IntegerFactory());
		print(ctt.createNew("Widget", 1).getClass().getSimpleName());
		print(ctt.createNew("Integer", 2).getClass().getSimpleName());
		ctt.createNew("Product", 8);
	}
}
