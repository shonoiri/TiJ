package Ex1;

import java.util.ArrayList;

/*Exercise 1: (2) Create a new class called Gerbil with an int gerbilNumber that’s
initialized in the constructor. Give it a method called hop( ) that displays which gerbil
number this is, and that it’s hopping. Create an ArrayList and add Gerbil objects to the
List. Now use the get( ) method to move through the List and call hop( ) for each Gerbil.*/

public class Gerbil {
	int gerbilNumber;
	public Gerbil() {
		this.gerbilNumber = 7;
	}
		
	void hop(){
		System.out.println(this.gerbilNumber);
	}

	public static void main(String [] args){
		ArrayList<Gerbil> gerbils = new ArrayList<>();
		Gerbil gerbil = new Gerbil();
		gerbils.add(gerbil);
		gerbils.get(0).hop();		
	}
}
