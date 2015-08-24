package ex21;

import java.util.HashMap;
import java.util.Map;
import generics.Product;
import static net.mindview.util.Print.*;

/*Exercise 21: ( 4) Modify ClassTypeCapture.java by adding a
Map<String,Class<?>>, a method addType(String typename, Class<?> kind), and
a method createNew(String typename). createNew( ) will either produce a new
instance of the class associated with its argument string, or produce an error message.*/

class Building {
}

class House extends Building {
}

public class ClassTypeCapture<T> {
	Class<T> kind;
	Map<String, Class<?>> types = new HashMap<String, Class<?>>();

	void addType(String typename, Class<?> kind) {
		types.put(typename, kind);
	}

	Object createNew(String typename) {
		Class<?> cl = types.get(typename);
		try {
			return cl.newInstance();
		} catch (NullPointerException e) {
			System.out.println("Not a registered typename: " + typename);
		} catch (Exception e) {
			print(e.toString());
		}
		return null;
	}

	public static void main(String[] args) {
		ClassTypeCapture<Building> ctt = new ClassTypeCapture();
		ctt.addType("Building", Building.class);
		ctt.addType("House", House.class);
		ctt.addType("Product", Product.class);
		print(ctt.createNew("Building").getClass());
		print(ctt.createNew("House").getClass());
		ctt.createNew("Product");
		ctt.createNew("Car");

	}
}
