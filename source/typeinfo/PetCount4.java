package typeinfo;

import java.util.*;
import generics.coffee.*;
import net.mindview.util.*;
import static net.mindview.util.Print.*;

public class PetCount4 {
	public static void main(String[] args) {
		TypeCounter counter = new TypeCounter(Coffee.class);
		for (Iterator<Coffee> it = new CoffeeGenerator(20).iterator(); it.hasNext();) {
			Coffee coffee = it.next();
			printnb(coffee.getClass().getSimpleName() + " ");
			counter.count(coffee);
		}
		print();
		print(counter);
	}
}