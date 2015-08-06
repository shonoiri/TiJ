package innerclass;
/*Exercise 5: (1) Create a class with an inner class. In a separate class, make an instance of
the inner class.*/
public class Ex5 {
	
	private class Inner{
		{System.out.println("Inner created");}
	}


private class Test{
	Ex5 ex5 = new Ex5();
	Ex5.Inner inner = ex5.new Inner();
}
}