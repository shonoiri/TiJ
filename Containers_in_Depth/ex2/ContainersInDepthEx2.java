package ex2;

/*Exercise 2: (2) Produce a Map and a Set containing all the countries that begin with ‘A’.*/

import static net.mindview.util.Countries.capitals;
import static net.mindview.util.Countries.names;
import static net.mindview.util.Print.print;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ContainersInDepthEx2 {

	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<>(capitals());
		Set<String> set = new TreeSet<>(names());
		String b = new String();
		for (String string : map.keySet()) {
			if (string.startsWith("B")) {
				b = string;
				break;
			}
		}

		Map<String, String> Amap = ((TreeMap<String, String>) map).headMap(b);
		Set<String> Aset = ((TreeSet<String>) set).headSet(b);
		print(Amap);
		print(Aset);
	}

}
