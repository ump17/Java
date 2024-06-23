package ForPractice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {

		// Creating an empty HashSet
		HashSet<String> h = new HashSet<>();

		// Adding elements into HashSet
		// using add() method
		h.add("India");
		h.add("Australia");
		h.add("South Africa");

		// Adding duplicate elements
		h.add("India");

		// Displaying the HashSet
		System.out.println(h);
		System.out.println("List contains India or not:" + h.contains("India"));

		// Removing items from HashSet
		// using remove() method
		h.remove("Australia");
		System.out.println("List after removing Australia:" + h);
		
		h.forEach((item)-> System.out.println(item));

		// Display message
		System.out.println("Iterating over list:");

		// Iterating over hashSet items
		Iterator<String> i = h.iterator();

		// Holds true till there is single element remaining
		while (i.hasNext())

			// Iterating over elements
			// using next() method
			System.out.println(i.next());
	}
	
	
}
