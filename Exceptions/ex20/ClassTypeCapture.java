package ex20;

import java.util.HashMap;
import java.util.Map;
import generics.Product;
import static net.mindview.util.Print.*;

/*Exercise 21: ( 4) Modify ClassTypeCapture.java by adding a
Map<String,Class<?>>, a method addType(String typename, Class<?> kind), and
a method createNew(String typename). createNew( ) will either produce a new
instance of the class associated with its argument string, or produce an error message.*/

class Building {}

class House extends Building {}

public class ClassTypeCapture<T> {
	Class<T> kind;
	Map<String, Class<?>> map = new HashMap<String, Class<?>>();

	public void addType(String typename, Class<?> kind) {
		map.put(typename, kind);
	}

	Object createNew(String typeName) {
		Class<?> cl = map.get(typeName);
		try {
			return cl.newInstance();
		} catch (NullPointerException e) {
			print("Not a registered typename: " + typeName);
		} catch (Exception e) {
			print(e.toString());
		}
		return null;
	}

	public static void main(String[] args) {
		ClassTypeCapture ctt = new ClassTypeCapture();
		ctt.addType("Building", Building.class);
		ctt.addType("House", House.class);
		ctt.addType("Product", Product.class);
		print(ctt.createNew("Building").getClass());
		print(ctt.createNew("House").getClass());
		ctt.createNew("Product");
		ctt.createNew("Car");
	}
}
/* Output:
true
true
false
true
*///:~
