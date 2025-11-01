package String;

import java.util.PriorityQueue;

//k largest element in queue - pepcoding
public class PriorityQue {

	public static void main(String[] args) {
		int[] arr = { 2, 10, 5, 17, 18, 6, 4 };
		int k = 3;

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

		while (pq.size() > 0) {
			System.out.println(pq.poll());
		}

	}
}
