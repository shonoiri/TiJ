package ex09;

/*Exercise 9: (1) Modify GenericMethods.java so that f( ) accepts three arguments, all
of which are of a different parameterized type.*/

public class MyGenericMethod1 {
	  public <A,B> void f(A a,B b,String c) {
	    System.out.println(a.getClass().getName());
	    System.out.println(b.getClass().getName());
	    System.out.println(c.getClass().getName());
	  }
	  public static void main(String[] args) {
	    MyGenericMethod1 gm = new MyGenericMethod1();
	    gm.f("","aaa","String");
	    gm.f(1,true,"");
	    gm.f(1.0,false,"14");
	    gm.f(1.0F,13,"");
	    gm.f('c'," ","''");
	    gm.f(gm,gm,gm.toString());
	  }
	}