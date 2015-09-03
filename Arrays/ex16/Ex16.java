package ex16;

/*Exercise 16: (3) Starting with CountingGenerator.java, create a SkipGenerator
class that produces new values by incrementing according to a constructor argument. Modify
TestArrayGeneration.java to show that your new class works correctly.*/

import java.util.Arrays;

import net.mindview.util.ConvertTo;
import net.mindview.util.Generated;

public class Ex16 {

	public static void main(String[] args) {
		boolean[] b1 = ConvertTo.primitive(Generated.array(Boolean.class, new SkipGenerator.Boolean(true), 5));
		byte[] b2 = ConvertTo.primitive(Generated.array(Byte.class, new SkipGenerator.Byte((byte) 1), 6));
		char[] b3 = ConvertTo.primitive(Generated.array(Character.class, new SkipGenerator.Character(3), 7));
		short[] b4 = ConvertTo.primitive(Generated.array(Short.class, new SkipGenerator.Short((short) 3), 8));
		int[] b5 = ConvertTo.primitive(Generated.array(Integer.class, new SkipGenerator.Integer(3), 4));
		long[] b6 = ConvertTo.primitive(Generated.array(Long.class, new SkipGenerator.Long((long) 4), 6));
		float[] b7 = ConvertTo.primitive(Generated.array(Float.class, new SkipGenerator.Float(3F), 8));
		double[] b8 = ConvertTo.primitive(Generated.array(Double.class, new SkipGenerator.Double(3.0), 5));

		System.out.println(Arrays.toString(b1));
		System.out.println(Arrays.toString(b2));
		System.out.println(Arrays.toString(b3));
		System.out.println(Arrays.toString(b4));
		System.out.println(Arrays.toString(b5));
		System.out.println(Arrays.toString(b6));
		System.out.println(Arrays.toString(b7));
		System.out.println(Arrays.toString(b8));

	}
}
