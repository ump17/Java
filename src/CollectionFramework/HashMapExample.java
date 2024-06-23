package CollectionFramework;

//Java Program to Demonstrate 
//Working of Map interface 

//Importing required classes 
import java.util.*;
import java.util.Map.Entry;

//Main class 
class HashMapExample {

	// Main driver method
	// Hashmap are not thread safe
	public static void main(String args[]) {
		// Creating an empty HashMap
		Map<String, Integer> hm = new HashMap<String, Integer>();

		// Inserting pairs in above Map
		// using put() method
		hm.put("a", new Integer(100));
		hm.put("b", new Integer(200));
		hm.put("c", new Integer(300));
		hm.put("d", new Integer(400));
		hm.put("e", null);

		// Traversing through Map using for-each loop
//		for (Map.Entry<String, Integer> me : hm.entrySet()) {
//			// Printing keys
//			System.out.print(me.getKey() + ":");
//			System.out.println(me.getValue());
//		}
		
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");

		Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();

		while(iterator.hasNext()) {
		    Map.Entry<Integer, String> entry = iterator.next();
		    Integer key = entry.getKey();
		    String value = entry.getValue();
		    System.out.println("Key: " + key + ", Value: " + value);
		}


	}
}
