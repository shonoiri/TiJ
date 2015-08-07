package Ex7;
import static net.mindview.util.Print.print;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Exercise 7: (3) Create a class, then make an initialized array of objects of your class. Fill
a List from your array. Create a subset of your List by using subList( ), then remove this
subset from your List.*/

public class ClassEx7 {

	public static void main(String[] args) {

		TestEx7[] test = new TestEx7[10];

		for (int i = 0; i < 10; i++) {
			test[i] = new TestEx7();
		}
		
		List<TestEx7> list = new ArrayList<TestEx7>(Arrays.asList(test));
		List<TestEx7> sublist = list.subList(0,10);
		list.removeAll(sublist);
		print(list);

	}
}

class TestEx7 {
	int number;
}

