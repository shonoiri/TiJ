package ex07;

/*Exercise 7: (2) Use composition instead of inheritance to adapt Fibonacci to make it
Iterable.*/

import java.util.Iterator;

import generics.Fibonacci;

public class MyIterableFibomacci implements Iterable<Integer> {
  private Fibonacci fb = new Fibonacci();
  private int n;
  public MyIterableFibomacci(int count) { n = count; }
  public Iterator<Integer> iterator() {
    return new Iterator<Integer>() {
      public boolean hasNext() { return n > 0; }
      public Integer next() {
        n--;
        return fb.next();
      }
      public void remove() { // Not implemented
        throw new UnsupportedOperationException();
      }
    };
  }	
  public static void main(String[] args) {
    for(int i : new MyIterableFibomacci(18))
      System.out.print(i + " ");
  }
}