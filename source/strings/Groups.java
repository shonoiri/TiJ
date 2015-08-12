package strings;

import java.util.HashSet;
import java.util.Set;

/*Exercise 12: (5) Modify Groups.java to count all of the unique words that do not start
with a capital letter.*/

//: strings/Groups.java
import java.util.regex.*;
import static net.mindview.util.Print.*;

public class Groups {
	static public final String POEM = "Twas brillig, and the slithy toves\n" + "Did gyre and gimble in the wabe.\n"
			+ "All mimsy were the borogoves,\n" + "And the mome raths outgrabe.\n\n"
			+ "Beware the Jabberwock, my son,\n" + "The jaws that bite, the claws that catch.\n"
			+ "Beware the Jubjub bird, and shun\n" + "The frumious Bandersnatch.";

	public static void main(String[] args) {
		Set<String> words = new HashSet<String>();
		Matcher m = Pattern.compile("\\b(([A-Z])\\w+)\\b").matcher(Groups.POEM);
		while (m.find())
			words.add(m.group(1));
		print("Number of unique words = " + words.size());
		print(words.toString());
	}
} /* Output:
[the slithy toves][the][slithy toves][slithy][toves]
[in the wabe.][in][the wabe.][the][wabe.]
[were the borogoves,][were][the borogoves,][the][borogoves,]
[mome raths outgrabe.][mome][raths outgrabe.][raths][outgrabe.]
[Jabberwock, my son,][Jabberwock,][my son,][my][son,]
[claws that catch.][claws][that catch.][that][catch.]
[bird, and shun][bird,][and shun][and][shun]
[The frumious Bandersnatch.][The][frumious Bandersnatch.][frumious][Bandersnatch.]
*///:~
