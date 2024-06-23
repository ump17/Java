package Generic;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodMain {
	public static void main(String[] args) {
		shout("ash");
		shout(12);
		shout(null);

		Doubleshout(11, 12);

		List<Integer> intList = new ArrayList<>();
		intList.add(22);
		printList(intList);
	}

	public static <T> void shout(T thingsToShout) {
		System.out.println(thingsToShout + "!!!!");
	}

	public static <T, V> void Doubleshout(T thingsToShout, V thingsToDoubleShout) {
		System.out.println(thingsToShout + "-" + thingsToDoubleShout + "!!!!");
	}

//	public static void printList(List<Object> myList) {
//		
//	}
	
	//? - wildcard - use as type parameter when you don't know that generic type would be
	public static void printList(List<?> myList) {
		System.out.println(myList);
	}
}
