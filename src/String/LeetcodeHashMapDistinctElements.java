package String;

import java.util.HashMap;
/*
 * 
 * The given code calculates the number of distinct elements in each sliding window of size k within the input 
 * array nums using a HashMap
 * 
 * */

public class LeetcodeHashMapDistinctElements {

	public static void main(String[] args) {

		int[] nums = { 2,5,5,6,3,2,3,2,4,5,2,2,2,2,3,6 };
		int k = 4;

		printArray(printDistinctEleInWindowOfSizeK(nums, k));
	}

	private static void printArray(int[] printDistinctEleInWindowOfSizeK) {

		for (int i = 0; i < printDistinctEleInWindowOfSizeK.length; i++) {
			System.out.print(printDistinctEleInWindowOfSizeK[i] + " ");
		}

	}

	private static int[] printDistinctEleInWindowOfSizeK(int[] nums, int k) {

		HashMap<Integer, Integer> map = new HashMap<>();
		int j = 0;
		int n = nums.length;
		int[] result = new int[n - k + 1];

		for (int i = 0; i < n; i++) {

			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

			if (i >= k - 1) {

				result[i - k + 1] = map.size();

				if (map.get(nums[j]) <= 1) {
					map.remove(nums[j]);
				} else {
					map.put(nums[j], map.get(nums[j]) - 1);
				}
				j++;

			}

		}

		return result;
	}

}
