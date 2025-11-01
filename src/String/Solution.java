package String;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

///https://leetcode.com/problems/first-unique-character-in-a-string/description/
class Solution {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3);
		list.forEach((x)-> System.out.println(x));
		
		Stream<Integer> stream = list.stream();
		List<Integer> list2 = stream.map(x-> x*2).collect(Collectors.toList());
		System.out.println(list2);
		
		//stream.forEach(System::println);
	}
	
}
