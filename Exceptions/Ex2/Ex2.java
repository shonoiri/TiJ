package Ex2;

/*Exercise 2: (1) Define an object reference and initialize it to null. Try to call a method
through this reference. Now wrap the code in a try-catch clause to catch the exception.*/

public class Ex2 {

	public static void main(String[] args) {
		String s = null;
		Object ob = null;
		try{
			ob.toString();
		}catch(Exception e){
			System.out.println("Exception : " + e);
		}

	}

}
