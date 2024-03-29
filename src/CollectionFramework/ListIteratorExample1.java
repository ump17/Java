package CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample1 {

	public static void main(String args[]) {
		List<String> names = new ArrayList<String>();
		names.add("Amit");
		names.add("Vijay");
		names.add("Kumar");
		names.add(1, "Sachin");

		//To traverse back provide size, if already cursor at end then no need
		ListIterator<String> it = names.listIterator(names.size());

//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}

		System.out.println("Traversing backward: ");
		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}

	}

}
