package ex27;

import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.Queue;

/*Exercise 27: (2) Write a class called Command that contains a String and has a
method operation( ) that displays the String. Write a second class with a method that fills
a Queue with Command objects and returns it. Pass the filled Queue to a method in a
third class that consumes the objects in the Queue and calls their operation( ) methods.*/

public class Class2 {

	static Queue<Command> que = new LinkedList<>();
	
	private Queue<Command> method(){
		for(int i = 0; i< 1000 ; i++){
			Class2.que.add(new Command());
		}
		return que;}
	
	public static void main(String [] args){
		Class2 cl = new Class2();
		cl.method();
		Class3.method2(que);
	}

}
