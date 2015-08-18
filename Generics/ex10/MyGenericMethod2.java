package ex10;

/*Exercise 10: (1) Modify the previous exercise so that one of f( )’s arguments is non-
parameterized.*/

public class MyGenericMethod2 {
	public <A, B> void f(A a, B b, String c) {
		System.out.println(a.getClass().getName());
		System.out.println(b.getClass().getName());
		System.out.println(c.getClass().getName());
	}

	public static void main(String[] args) {
		MyGenericMethod2 gm = new MyGenericMethod2();
		gm.f("", "aaa", "String");
		gm.f(1, true, "");
		gm.f(1.0, false, "14");
		gm.f(1.0F, 13, "");
		gm.f('c', " ", "''");
		gm.f(gm, gm, gm.toString());
	}
}
