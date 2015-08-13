package typeinfo;

//: typeinfo/Shapes.java
import java.util.*;

abstract class Shape {
  void draw() { System.out.println(this + ".draw()"); }
  abstract public String toString();
}

class Romboid extends Shape {
	  public String toString() { return "Romboid"; }
	}


class Circle extends Shape {
  public String toString() { return "Circle"; }
}

class Square extends Shape {
  public String toString() { return "Square"; }
}

class Triangle extends Shape {
  public String toString() { return "Triangle"; }
}	

public class Shapes {
  public static void main(String[] args) {
    List<Shape> shapeList = Arrays.asList(
      new Circle(), new Square(), new Triangle(), new Romboid()
    );
    for(Shape shape : shapeList)
      shape.draw();
    Shape ramboid = new Romboid();
    if(ramboid instanceof Romboid){
    Romboid r = (Romboid)ramboid;}
   // Circle r = (Circle)ramboid;
    
  }
} /* Output:
Circle.draw()
Square.draw()
Triangle.draw()
*///:~
