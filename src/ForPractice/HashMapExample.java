package ForPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();

		map.put(3,"three");
		map.put(1,"one");
		map.put(2,"two");
		
		System.out.println(map);

		for( Map.Entry<Integer, String>  e : map.entrySet()) {
			System.out.println("Key: " + e.getKey()
            + " Value: " + e.getValue());
		}
		
		map.forEach((key,value)-> System.out.println(key + " -> " + value));
		
		map.entrySet().stream().forEach(item -> System.out.println(item.getKey()+" " + item.getValue()));
		
		
		
		LinkedHashMap<Integer, String> Lmap = new LinkedHashMap<>();

		 // using put() method 
		Lmap.put(3, "Geeks"); 
		Lmap.put(2, "For"); 
		Lmap.put(1, "Geeks"); 
  
        // Printing mappings to the console 
        System.out.println("Mappings of LinkedHashMap : "
                           + Lmap); 
        
        Lmap.forEach((key,value)-> System.out.println(key + " -> " + value));
        Lmap.entrySet().stream().forEach(item -> System.out.println(item.getKey()+" " + item.getValue()));
        for( Map.Entry<Integer, String>  e : Lmap.entrySet()) {
			System.out.println("Key: " + e.getKey()
            + " Value: " + e.getValue());
		}
    
	}	

}
