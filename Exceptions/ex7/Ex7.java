package ex7;

import java.util.logging.Logger;

import java.io.*;

/*Exercise 7: (1) Modify Exercise 3 so that the catch clause logs the results.*/

public class Ex7 {

	private static Logger logger = Logger.getLogger("logException ");

	static void au(Exception e) {
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}

	public static void main(String[] args) {
		int[] a = new int[3];

		try {
			System.out.println(a[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			au(e);
		}
	}
}
