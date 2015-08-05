package iterface;

/*(2) Create a Cycle interface, with implementations Unicycle, Bicycle
 and Tricycle. Create factories for each type of Cycle, and code that uses these factories.*/

interface Cycle {
	void ride();
}

interface CykleFaktory {
	Cycle getCykle();
}

class Unicykle implements Cycle {

	@Override
	public void ride() {
		System.out.print("Unicykle ");
	}
}

class UnicykleFaktory implements CykleFaktory {

	@Override
	public Cycle getCykle() {
		return new Unicykle();
	}
}

class Bicykle implements Cycle {

	@Override
	public void ride() {
		System.out.print("Bicykle ");
	}
}

class BicykleFaktory implements CykleFaktory {

	@Override
	public Cycle getCykle() {
		// TODO Auto-generated method stub
		return new Bicykle();
	}
}

class Tricykle implements Cycle {

	@Override
	public void ride() {
		System.out.print("Tricykle ");
	}
}

class TricykleFaktory implements CykleFaktory {

	@Override
	public Cycle getCykle() {
		return new Tricykle();
	}
}


public class Ex18 {
	
	public static void rideCykle(CykleFaktory factory){
		Cycle c = factory.getCykle();
		c.ride();		
	}
	
	public static void main(String [] args){
		rideCykle(new UnicykleFaktory());
		rideCykle(new BicykleFaktory());
		rideCykle(new TricykleFaktory());
		
	}

}
