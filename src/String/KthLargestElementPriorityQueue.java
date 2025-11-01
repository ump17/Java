package String;

import java.util.PriorityQueue;

//Kth largest element
public class KthLargestElementPriorityQueue {
	
	 public static void main(String[] args) {
	        int[] arr = {2, 10, 5, 17, 18, 6, 4};
	        int k = 2;  // We want the 3rd largest element
	        
	        System.out.println("The " + k + "rd largest element is: " + findKthLargest(arr, k));
	    }

	private static Integer findKthLargest(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for (int i = 0; i < arr.length; i++) {

			// add start k element
			if (i < k) {
				pq.offer(arr[i]);
			} else {
				// once k are there, remove small elements
				if (arr[i] > pq.peek()) {
					pq.poll();
					pq.offer(arr[i]);
				}

			}

		}
		
		return pq.poll();
	}

}
