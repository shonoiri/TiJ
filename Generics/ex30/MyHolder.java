package ex30;

import generics.Holder;
import static net.mindview.util.Print.*;

/*Exercise 30: (2) Create a Holder for each of the primitive wrapper types, and show that
autoboxing and autounboxing works for the set( ) and get( ) methods of each instance.*/

public class MyHolder {
	public static void main(String[] args) {
		Holder<Integer> hi = new Holder<Integer>();
		hi.set(1);
		int i = hi.get();
		print(i == 1);
		Holder<Byte> hb = new Holder<Byte>();
		hb.set((byte)1);
		byte b = (byte)1;
		print(b == (byte)1);
		Holder<Character> hc = new Holder<Character>();
		hc.set('c');
		char c = 'c';
		print(c == 'c');
		Holder<Short> hs = new Holder<Short>();
		hs.set((short)1);
		short s = hs.get();
		print(s == 1);
		Holder<Long> hl = new Holder<Long>();
		hl.set(1L);
		long l = hl.get();
		print(l == 1);
		Holder<Float> hf = new Holder<Float>();
		hf.set(1.0F);
		float f = hf.get();
		print(f == 1.0F);
		Holder<Double> hd = new Holder<Double>();
		hd.set(1.0);
		double d = hd.get();
		print(d == 1.0);
		Holder<Boolean> hbool = new Holder<Boolean>();
		hbool.set(true);
		boolean bool = hbool.get();
		print(bool);
	}
}
