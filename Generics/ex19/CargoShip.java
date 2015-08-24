package ex19;

import java.util.ArrayList;
import ex13.Generators;
import generics.Product;

/*Exercise 19: (2) Following the form of Store.java, build a model of a containerized
cargo ship.*/

class CargoHold extends ArrayList<Conteiner> {
	public CargoHold(int nConteiners, int nProducts) {
		for (int i = 0; i < nConteiners; i++) {
			add(new Conteiner(nProducts));
		}
	}
}

class Conteiner extends ArrayList<Product> {
	public Conteiner(int nProducts) {
		Generators.fill(this, Product.generator, nProducts);
	}
}

class Crane {
}

class CommandSection {
}

class Ship extends ArrayList<CargoHold> {
	private ArrayList<Crane> cranes = new ArrayList<Crane>();
	private CommandSection commandSection = new CommandSection();

	public Ship(int nCardoholds, int nConteiners, int nProducts) {
		for (int i = 0; i < nCardoholds; i++) {
			add(new CargoHold(nCardoholds, nProducts));
		}
	}

	public String toString() {
		StringBuilder str = new StringBuilder();
		for (CargoHold ch : this) {
			for (Conteiner con : ch) {
				for (Product cof : con) {
					str.append(cof);
					str.append("\n");
				}
			}
		}
		return str.toString();
	}
}

public class CargoShip {

	public static void main(String[] args) {
		System.out.println(new Ship(14, 5, 10));

	}

}
