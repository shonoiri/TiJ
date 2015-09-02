package ex13;

import net.mindview.util.CountingGenerator;

/*Exercise 13: (2) Fill a String using CountingGenerator.Character.*/

public class Ex13 {
	public static void main(String[] args) {
		String string = new CountingGenerator.String(12).next();
		System.out.println(string);
	}
}
