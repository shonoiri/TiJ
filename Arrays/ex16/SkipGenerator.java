package ex16;

import net.mindview.util.Generator;

public class SkipGenerator {
	public static class Boolean implements Generator<java.lang.Boolean> {
		private boolean value;
		private boolean step;

		public Boolean(boolean step) {
			this.step = step;
		}

		public java.lang.Boolean next() {
			value = step ? !value : value;
			return value;
		}
	}

	public static class Byte implements Generator<java.lang.Byte> {
		private byte value;
		private byte step;

		public Byte(byte step) {
			this.step = step;
		}

		public java.lang.Byte next() {
			byte oldValue = value;
			value += step;
			return oldValue;
		}
	}

	static char[] chars = ("abcdefghijklmnopqrstuvwxyz" + "ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();

	public static class Character implements Generator<java.lang.Character> {
		int index;
		private int step;
		
		public Character(int step) {
			this.step = step;
		}
		public java.lang.Character next() {
			char oldValue = chars[index];
			index = (index + step) % chars.length;
			return oldValue;
		}
	}

	public static class String implements Generator<java.lang.String> {
		private int length;
		Generator<java.lang.Character> cg;

		public String(int step) {
			this(step, 7);
		}

		public String(int step, int length) {
			this.length = length;
			cg = new Character(step);
		}

		public java.lang.String next() {
			char[] buf = new char[length];
			for (int i = 0; i < length; i++)
				buf[i] = cg.next();
			return new java.lang.String(buf);
		}
	}

	public static class Short implements Generator<java.lang.Short> {
		private short value;
		private short step;

		public Short(short step) {
			this.step = step;
		}

		public java.lang.Short next() {
			short oldValue = value;
			value += step;
			return oldValue;
		}
	}

	public static class Integer implements Generator<java.lang.Integer> {
		private int value;
		private int step;

		public Integer(int step) {
			this.step = step;
		}

		public java.lang.Integer next() {
			int oldValue = value;
			value += step;
			return oldValue;
		}
	}

	public static class Long implements Generator<java.lang.Long> {
		private long value;
		private long step;
		
		public Long(long step) {
			this.step = step;
		}
		public java.lang.Long next() {
			long oldValue = value;
			value += step;
			return oldValue;
		}
	}

	public static class Float implements Generator<java.lang.Float> {
		private float value;
		private float step;
		
		public Float(float step) {
			this.step = step;
		}

		public java.lang.Float next() {
			float oldValue = value;
			value += step;
			return oldValue;
		}
	}

	public static class Double implements Generator<java.lang.Double> {
		private double value;
		private double step;

		public Double(double step) {
			this.step = step;
		}
		public java.lang.Double next() {
			double result = value;
			value += step;
			return result;
		}
	}
}
