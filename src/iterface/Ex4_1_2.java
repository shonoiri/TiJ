package iterface;

public class Ex4_1_2 {

		public static void testPrint(Ex4 d) {
			((Ex4_1)d).method();
		}
		public static void secondTestPrint(Ex4_1_1 sd) {
			sd.method();
		}
		public static void main(String[] args) {
			Ex4_1 s = new Ex4_1();
			Ex4_1_2.testPrint(s);
			Ex4_1_1 ss = new Ex4_1_1();
			Ex4_1_2.secondTestPrint(ss);			
		}
	}

