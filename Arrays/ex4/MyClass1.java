package ex4;

import java.util.Locale;

/*Exercise 4: (2) Repeat the previous exercise for a three-dimensional array.*/

public class MyClass1{

	private static double[][][] method1(int a, int b, int c, double start, double end) {
		double[][][] result = new double[a][b][c];
		double incr = (end - start) / (a * b);
		double val = start;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				for (int j2 = 0; j2 < c; j2++) {

					result[i][j][j2] = val;
					val += incr;
				}
			}
		}
		return result;
	}

	private static void method2(double[][][] da) {
		for (int i = 0; i < da.length; i++) {
			double[][] temp = da[i];
			for (int j = 0; j < temp.length; j++) {
				double[] temp2 = da[i][j];
				for (double db : temp2) {
					System.out.printf(Locale.US, "%.2f", db);
					System.out.print(" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		method2(method1(3, 2, 9, 22.0, 23.9));

	}

}
