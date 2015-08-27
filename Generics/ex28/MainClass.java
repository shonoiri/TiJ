package ex28;

import typeinfo.pets.Cat;
import typeinfo.pets.Mouse;
import typeinfo.pets.Pet;
import typeinfo.pets.Rodent;

public class MainClass {
	static <T> void method(Generic1<? super T> obj, T item) {
		obj.methodG1(item);
	}

	static <T> T method2(Generic2<? extends T> obj) {
		return obj.methodG2();
	}

	public static void main(String[] args) {
		Generic1<Rodent> g1 = new Generic1<Rodent>();
		method(g1, new Mouse()); // OK
		// Compile error: Cat is not a Rodent
		// f1(g1, new Cat());
		Generic2<Pet> g2 = new Generic2<Pet>();
		Pet pet = method2(g2); // OK
		Generic2<Cat> g3 = new Generic2<Cat>();
		Cat cat = method2(g3); // OK
		pet = method2(g3); // OK

	}

}
