package test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMap {
	
	public static void main(String[] args) {
		List<List<String>> arrayList = Arrays.asList(
				Arrays.asList("ashish","singh"),
				Arrays.asList("piyush","sonar")
				
	  );
		
		arrayList.stream().flatMap(List::stream).forEach(System.out::println);
		
//		ArrayList<Integer> list1 = new ArrayList<>();
//		list1.add(22);
//		list1.add(11);
//		Collections.sort(list1);
//		for(Integer var: list1) {
//			System.out.println(var);
//		}
//		
//		Iterator<Integer> it  = list1.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		List<String> sentences = Arrays.asList("Hello world", "Java streams", "Java example");
		//List<String> ans =  sentences.flatMap(list -> list.stream()).distinct().collect(Collectors.toList());
		//sentences.stream().flatMap(String::stream).collect(Collectors.groupingBy(word-> word, Collectors.counting()));
		String result = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" "))) // Split sentences into words
                .map(String::toLowerCase) // Convert each word to lowercase
                .distinct() // Ensure no duplicates
                .collect(Collectors.joining(": ")); // Join with commas

        // Print the result
        System.out.println("[ " + result + " ]");
        
        Map<String, Long> result2 =  sentences.stream().flatMap(sentence -> Arrays.stream(sentence.split(" "))).map(String::toLowerCase).collect(Collectors.groupingBy(word-> word, Collectors.counting()));
        System.out.println("[ " + result2 + " ]");
        
        List<int[]> arrays = Arrays.asList(
                new int[]{1, 2, 3},
                new int[]{4, 5, 6},
                new int[]{7, 8}
            );

            // Flatten the arrays
            List<Integer> flatList = arrays.stream()
                                           .flatMapToInt(Arrays::stream).boxed().collect(Collectors.toList());
            System.out.println(flatList);
                                           
	}

}
