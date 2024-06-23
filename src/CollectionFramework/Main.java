package CollectionFramework;

//public class Main {
//	public static void main(String[] args) {
//
//		// Make a collection
//		ArrayList<String> cars = new ArrayList<String>();
//		cars.add("Volvo");
//		cars.add("BMW");
//		cars.add("Ford");
//		cars.add("Mazda");
//
//		// Get the iterator
//		//Iterator it = cars.iterator(); -> this also works
//		Iterator<?> it = cars.iterator();
//
//		// Print the first item
//		System.out.println(it.next());
//
//	}
//}

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(3, "four"); // same key to new wala puraane ko replace krega
        
        System.out.println(map);

        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            if(entry.getKey() == 2) {
                iterator.remove(); // Remove the entry
                System.out.println("Removed entry with key 2");
            }
            
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Print the remaining entries to verify
        System.out.println("Remaining entries------------------------->");
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

