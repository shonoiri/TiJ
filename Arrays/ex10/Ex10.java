package ex10;

import java.util.*;

public class Ex10 {
	public static void main(String[] args) {
		ArrayList<List<String>> ls = new ArrayList<List<String>>();
		ls.add(new ArrayList<String>());
		// ls.add(new ArrayList<Integer>());
		ls.get(0).add("Array of Generics");
		System.out.println(ls.toString());
	}
}
