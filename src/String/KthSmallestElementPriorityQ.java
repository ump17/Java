package String;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestElementPriorityQ {
	public static void main(String[] args) {
		int[] arr = { 2, 10, 5, 17, 18, 6, 4 };
		int k = 2; // We want the 3rd smallest element

		System.out.println("The " + k + "rd s element is: " + findKthSmallest(arr, k));
	}

	private static Integer findKthSmallest(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

		for (int i = 0; i < arr.length; i++) {

			// add start k element
			if (i < k) {
				pq.offer(arr[i]);
			} else {
				if (arr[i] < pq.peek()) {
					pq.poll();
					pq.offer(arr[i]);
				}

			}

		}

		return pq.poll();

	}
}
