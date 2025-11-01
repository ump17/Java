package JavaPrograms;

import java.util.Stack;

public class FactorialProgram {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		Stack<Integer> st = new Stack<>();
		st.push(nums[0]);
        for(int i=1; i< nums.length;i++){
            if(!st.isEmpty() && st.peek()<nums[i]){
                st.push(nums[i]);
            }
        }
        System.out.println(st.size());
	}
	
	

}
