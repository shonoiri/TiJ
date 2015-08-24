package ex09;

/*Exercise 9: (1) Modify GenericMethods.java so that f( ) accepts three arguments, all
of which are of a different parameterized type.*/

public class MygenericsMethod {
	  public <A,B,C> void f(A a,B b,C c) {
	    System.out.println(a.getClass().getName());
	    System.out.println(b.getClass().getName());
	    System.out.println(c.getClass().getName());
	  }
	  public static void main(String[] args) {
	    MygenericsMethod gm = new MygenericsMethod();
	    gm.f("","aaa",(int)12.3);
	    gm.f(1,true,"");
	    gm.f(1.0,false,14);
	    gm.f(1.0F,13,"");
	    gm.f('c'," ",'a');
	    gm.f(gm,gm,gm);
	  }
	}