package String;

import java.util.HashMap;

// count of all subarray with zero sum
public class LeetcodeHashMapAllSubarrayZeroSum {

	public static void main(String[] args) {
		int[] nums = { 2,8,-3,-5,2,-4,6,1,2,1,-3,4 };
		//int[] nums = { 1,2,-3,1,0,5};
		
		System.out.println(NumOfSubarrayWithSumZero(nums));
	}

	private static int NumOfSubarrayWithSumZero(int[] nums) {
		 int count = 0;
		 int sum = 0;
		 HashMap<Integer,Integer> map = new HashMap<>();
		 map.put(0, 1);
		 
		 for(int i=0;i<nums.length;i++) {
			 
			 sum+=nums[i];
			 map.put(sum, map.getOrDefault(sum, 0)+ 1);
			 
			 //repeat hua to count++
			 if(map.getOrDefault(sum,0)>1) {
				 count+= map.get(sum)-1;
			 }
		 }
		 
		 
		return count;
	}
}
