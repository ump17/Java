package String;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
	
	public static void main(String[] args) {
		
	 Map<String,Integer> map = new HashMap<>();
	 map.put("a", 1);
	 map.put("b", 2);
	 map.put("c", 3);
	 map.put("c", 4);
	 map.put("d", 4);
	 map.put("B", 20);
//	 map.putIfAbsent("C", 5); // Inserts "C" with value 5 if not already present
//	 map.replace("B", 20, 10); // Replaces value of "B" from 2 to 10 if current value is 2
//	 map.replace("B", 15); // Replaces value of "B" to 15 if it's mapped to any value
//	 map.compute("B", (key, val) -> val * 2); // Doubles the value of "B"
//	 map.computeIfAbsent("z", k -> 100); // If "D" is absent, assigns value 100 to it
//
//
//	 
//	 int value = map.get("a"); 
//	 Integer exists = map.size();
//	 System.out.println(value );
//	 System.out.println(exists);
//	 
//	 for (Map.Entry<String, Integer> entry : map.entrySet()) {
//		    System.out.println(entry.getKey() + ": " + entry.getValue());
//		}


	 
	 System.out.println(map.size());
	}

}
