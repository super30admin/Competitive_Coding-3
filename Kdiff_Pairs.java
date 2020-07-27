// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes


import java.util.*;

public class Kdiff_Pairs {
	public static int findPairs(int[] nums, int k) {
		if(nums == null || nums.length == 0)
			return 0;
		if (k < 0)
			return 0;

		Set<Integer> result = new HashSet<>();
		Set<Integer> set = new HashSet<>();

		for(int i = 0; i< nums.length; i++){
			if(set.contains(nums[i]-k))
				result.add(nums[i]-k);

			if(set.contains(nums[i]+k))
				result.add(nums[i]);

			set.add(nums[i]);    
		}
		return result.size();   
	}
	public static void main(String[] args) {
		int[] nums= {3, 1, 4, 1, 5};
		int k = 2;
		System.out.println(findPairs(nums, k));

	}
}

/**********************************************************/
//Time Complexity : O(n logn)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes

class Solution {
	public int findPairs(int[] nums, int k) {
		Arrays.sort(nums);
		int count =0;
		int low = 0;
		int high = 0;
		while(low< nums.length && high < nums.length){
			if(low == high || nums[high] - nums[low] < k)
				high++;

			else if(nums[high] - nums[low] > k)
				low++;

			else{
				count++;
				low++;
				high++;

				//check for unique
				while(high < nums.length && nums[high]== nums[high-1])
					high++;
			}
		}
		return count;
	}
}
