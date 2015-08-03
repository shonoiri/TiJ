package iterface;

/*Exercise 14: (2) Create three interfaces, each with two methods. Inherit a new interface
that combines the three, adding a new method. Create a class by implementing the new
interface and also inheriting from a concrete class. Now write four methods, each of whichtakes 
one of the four interfaces as an argument. In main( ), create an object of your class
and pass it to each of the methods.*/

/*Exercise 15: (2) Modify the previous exercise by creating an abstract class and
inheriting that into the derived class.*/

/*Exercise 17: (2) Prove that the fields in an interface are implicitly static and final.*/

interface Interface1{
	int x = 0; 
	void method1();
	void method2();
	void method3();
}

interface Interface2{
	void method2_1();
	void method2_2();
	void method2_3();
}

interface Interface3{
	void method3_1();
	void method3_2();
	void method3_3();
}

class Class{
	
}

class Test1 extends Class implements Interface1,Interface2,Interface3{

	@Override
	public void method3_1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3_2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3_3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2_1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2_2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2_3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	} 
	
}

public class Ex14 {
	public static void main(String [] args){
		System.out.println(Interface1.x);
		//Interface1.x = 12;
	}

}
