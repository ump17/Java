package ForPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
 
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(22);
        arr1.add(24);
        arr1.add(1, 23);
        arr1.set(2, 25); //index,value
        arr1.remove(1);//index
        // get() method to get the element at a specific index 
        //Collections.sort(arr1);
        
        System.out.println("Array 1:" + arr1);
        
        Iterator<Integer> i = arr1.iterator();
        
//        while(i.hasNext())
//        	System.out.println(i.next());
        
        ListIterator<Integer> li = arr1.listIterator();
        
        while(li.hasNext()) 
        	System.out.println(li.next());
        
        	
        
        while(li.hasPrevious()) 
        	System.out.println(li.previous());
        
        	
        
	}
}
