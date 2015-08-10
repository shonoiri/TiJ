package ex4;

public class MyClass {

	public static void main(String[] args) {
		try{
			throw new MyException("My exception ");
		}catch(MyException e){
			e.print();
		}
	}
}
