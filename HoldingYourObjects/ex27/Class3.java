package ex27;

import java.util.Queue;

/*Exercise 27: (2) Write a class called Command that contains a String and has a
method operation( ) that displays the String. Write a second class with a method that fills
a Queue with Command objects and returns it. Pass the filled Queue to a method in a
third class that consumes the objects in the Queue and calls their operation( ) methods.*/

public class Class3 {
	
	public static void method2(Queue<Command> que){
		for(Command com : que){
			com.operation();
		}
	}

}
