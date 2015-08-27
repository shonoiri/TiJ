package ex29;

import static net.mindview.util.Print.print;
import java.util.ArrayList;
import java.util.List;
import generics.Holder;

/*Exercise 29: (5) Create a generic method that takes as an argument a
Holder<List<?>>. Determine what methods you can and can’t call for the Holder and for
the List. Repeat for an argument of List<Holder<?>>.*/

public class MainClass {

	static <T> void f1(Holder<List<?>> holder) {
		List<?> list = holder.get();
		print(holder.equals(list));
		list.add(null);
		// list.add(1); compile error
		Integer i = (Integer) list.get(0);
		print(i);
		print(list.contains(i));
		print(list.remove(0));
		holder.set(list);
		holder.set(new ArrayList<Float>());
	}

	static void f2(List<Holder<?>> list) {
		Holder<?> holder = (Holder<?>) list.get(0);
		print(holder.equals(list));
		print(holder.equals(Integer.valueOf(1)));
		// holder.set(new Integer(2));
		print(holder.get());
		list.add(new Holder<Float>(11F));
		print(list.get(1).get());
		list.remove(0);
		print(list.size());
	}

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		f1(new Holder<List<?>>(list1));
		List<Holder<?>> list2 = new ArrayList<Holder<?>>();
		list2.add(new Holder<Integer>(1));
		f2(list2);
	}

}
