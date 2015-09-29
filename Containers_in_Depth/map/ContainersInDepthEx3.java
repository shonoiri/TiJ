package map;

import static net.mindview.util.Countries.names;
import static net.mindview.util.Print.print;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*Exercise 3: (1) Using Countries, fill a Set multiple times with the same data and verify
that the Set ends up with only one of each instance. Try this with HashSet,
LinkedHashSet, and TreeSet.*/

public class ContainersInDepthEx3 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(names());
		Set<String> setl = new LinkedHashSet<>(names());
		Set<String> sett = new TreeSet<>(names());
		print(set);
		set.addAll(set);
		print(set);
		print();
		print(setl);
		setl.addAll(setl);
		print(setl);
		print();
		print(sett);
		sett.addAll(sett);
		print(sett);
	}
}
