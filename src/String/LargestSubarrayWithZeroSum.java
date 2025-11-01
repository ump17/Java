package String;

import java.util.HashMap;

public class LargestSubarrayWithZeroSum {

	public static void main(String[] args) {
		int[] nums = { 2,8,-3,-5,2,-4,6,1,2,1,-3,4 };
		

		System.out.println(lengthOfLargestSubarray(nums));
	}

	private static int lengthOfLargestSubarray(int[] nums) {
		
		int maxSubArrayLength = 0;
		int currLength = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		int n = nums.length;
		int sum =0;
		
		map.put(sum, -1);
		
		for(int i=0;i<n ; i++) {
			
			sum+=nums[i];
			
			if(map.containsKey(sum)) {
				currLength = i - map.get(sum);
				if(currLength > maxSubArrayLength)
					maxSubArrayLength = currLength;
			}else {
				map.put(sum, i);
			}
			
			
			
		}
		
		
		return maxSubArrayLength;
	}
}
