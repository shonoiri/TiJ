import generics.*;
//import typeinfo.pets.Mouse;
import typeinfo.pets.*;

public class Ex1 {

	public static void main(String[] args) {
		Holder3<Pet> pets = new Holder3<Pet>(new Mouse("Micker"));
		System.out.println(pets.get());
	}

}
