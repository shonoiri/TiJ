package ex19;

public class NewMyClass extends MyClass{
	
	public NewMyClass(int i) {
		super(i);
	}
	public boolean equals(Object o){
		return o instanceof NewMyClass && i ==((MyClass)o).i; 
	}
}