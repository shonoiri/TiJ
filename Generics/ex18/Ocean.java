package ex18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

import ex13.Generators;
import net.mindview.util.Generator;

/*Exercise 18: (3) Following the form of BankTeller.java, create an example where
BigFish eat LittleFish in the Ocean.*/

class BigFish{
	  private static long counter = 1;
	  private final long id = counter++;
	  private BigFish(){}
	  public String toString() { return "BigFish " + id; }
	  public static Generator<BigFish> generator(){
		  return new Generator<BigFish>(){
			  public BigFish next(){return new BigFish();}
		  };
	  }
}

class LittleFish{
	  private static long counter = 1;
	  private final long id = counter++;
	  private LittleFish(){}
	  public String toString() { return "LittleFish " + id; }
	  public static Generator<LittleFish> generator =
		  new Generator<LittleFish>(){
			  public LittleFish next(){return new LittleFish();}
		  };
	  }


public class Ocean {
	public static void eat(BigFish bf, LittleFish lf){
		System.out.println(bf + " eat " + lf);
	}
	
	public static void main(String[] args) {
	    Random rand = new Random(47);
	    Queue<LittleFish> line = new LinkedList<LittleFish>();
	    Generators.fill(line, LittleFish.generator, 15);
	    List<BigFish> BigFishs = new ArrayList<BigFish>();
	    Generators.fill(BigFishs, BigFish.generator(), 4);
	    for(LittleFish c : line)
	      eat(BigFishs.get(rand.nextInt(BigFishs.size())), c);
	}

}
