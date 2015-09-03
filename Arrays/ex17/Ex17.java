package ex17;

import java.math.BigDecimal;
import java.util.Arrays;

import net.mindview.util.Generated;

public class Ex17 {
	public static void main(String[] args) {
		BigDecimal[] b = Generated.array(BigDecimal.class, new BigDecimalGenerator(new BigDecimal(8)), 8);
		BigDecimal[] b1 = {new BigDecimal("3"), new BigDecimal("7")};
		BigDecimal[] b2 = Generated.array(BigDecimal.class, new BigDecimalGenerator(new BigDecimal("5")), 9);
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(b1));
		System.out.println(Arrays.toString(b2));
		
	}
}
