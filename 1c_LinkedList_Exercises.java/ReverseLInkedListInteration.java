/* 2. Write a Java program to iterate a linked list in reverse order (using
objlist.descendingIterator()) */

package prog1;
import java.util.*;

public class ReverseLInkedListInteration {
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();

	        // Adding elements to the list
	        list.add("Red");
	        list.add("Green");
	        list.add("Blue");
	        list.add("Yellow");

	        // Getting a descending (reverse) iterator
	        Iterator<String> descendingIterator = list.descendingIterator();

	        System.out.println("Iterating in reverse order:");
	        while (descendingIterator.hasNext()) {
	            System.out.println(descendingIterator.next());
	        }
	    }
	}


