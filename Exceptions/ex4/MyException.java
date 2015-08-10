package ex4;

/*Exercise 4: (2) Create your own exception class using the extends keyword. Write a
constructor for this class that takes a String argument and stores it inside the object with a
String reference. Write a method that displays the stored String. Create a try-catch clause
to exercise your new exception.*/

public class MyException extends Exception{

	private static final long serialVersionUID = -8113473796072312424L;
	
	String string ;
	
	public MyException(String str){
		this.string = str;
	}
	
	public void print(){
		System.out.println("msg " + string);
	}
}
