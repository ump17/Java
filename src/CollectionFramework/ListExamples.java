package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExamples {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();  
		System.out.println("learning Collection framework: ");
		
		list.add("Mango");
		list.add("banana");
		System.out.println(list);
		System.out.println(list.size());
		
		for(String fruits : list) {
			System.out.println(fruits);
		}
		
		// convert Array to List 
		
		List<String> list2=new ArrayList<String>();
		String[] array={"Java","Python","PHP","C++"};  
		System.out.println("Printing Array: "+Arrays.toString(array));
		
		for(String lang: array) {
			list2.add(lang);
		}
		System.out.println(list2);
		
		//sort
		Collections.sort(list2);
		for(String sortedList :list2)  {
		    System.out.println(sortedList);  
		 } 
		
		// List to array
		
		List<String> fruitList = new ArrayList<>();    
		 fruitList.add("Mango");    
		 fruitList.add("Banana");    
		 fruitList.add("Apple");    
		 fruitList.add("Strawberry");  
		 
		 //System.out.println(fruitList);
		 
		 String[] fruits = fruitList.toArray(new String[fruitList.size()]);  
		 for(String fruitsName: fruits) {
			// System.out.println(fruitsName);
		 }
		 
		 
		 //
		// array input 
	        String students[] = { "Kamlesh", "Abhay", 
	                              "Abhishek", "Shivansh" }; 
	  
	        // printing input elements for comparison 
	        System.out.println("Array input: "
	                           + Arrays.toString(students));
	  
	        // converting array into Collection 
	        // with asList() function 
	        List<String> studentList = Arrays.asList(students); 
	  
	        // print converted elements 
	        System.out.println("Converted elements: "
	                           + studentList); 
		
	}
	
}
