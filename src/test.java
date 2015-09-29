import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) { 
        Integer i = new Integer("10"); 
        if (i.toString().intern() == i.toString().intern()) { 
            System.out.println("Равный"); 
        } else { 
            System.out.println("Неравный"); 
        } 
    } 
	} 

