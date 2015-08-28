package ex32_33;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.*;

class FullStackException extends RuntimeException {}

class FixedSizeStack2<T> {
private int index;
private final int size;
private final List<T> storage;
public FixedSizeStack2(int size) {
storage = new ArrayList<T>(size);
this.size = size;
}
public void push(T item) {
if(index < size) {
index++;
storage.add(item);
} else
throw new FullStackException();
}
public T pop() {
if(index > 0)
return storage.get(--index);
throw new EmptyStackException();
}
}

public class NewGenericCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
