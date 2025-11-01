package String;

import java.util.HashMap;

//all subarray having sum k
public class HashMapAllSubraayHavingSumK {

	public static void main(String[] args) {
		int[] nums = { 3, 9, -2, 4, 1, -7, 2, 6, -5, 8, -3, -7, 6, 2, 1 };
		int k = 5;

		System.out.println(SubarrayHavingSumK(nums, k));
	}

	private static int SubarrayHavingSumK(int[] nums, int sum) {

		int currsum = 0;
		int count = 0;
		int n = nums.length;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1); // to handle special condition

		for (int i = 0; i < n; i++) {
			currsum = currsum + nums[i];
			map.put(currsum, map.getOrDefault(currsum, 0) + 1);

			if (map.containsKey(currsum - sum)) {
				count += map.get(currsum - sum);
			}

		}

		return count;
	}
}
