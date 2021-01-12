//Time Complexity: O(nlogn)
//Space Complexity: O(n)

import java.util.Arrays;

public class Solution2 {
	public static int calcPair(int[] nums, int k) {
		//Edge case
		if(nums == null || nums.length == 0)return 0;
		Arrays.sort(nums);
		int i=0;
		int j = 1;
		int counter1 =0;
		while(i<nums.length && j<nums.length) {
			
			if(i == j || nums[j] - nums[i]<k) {
			j++;
			}
			else if(nums[j]-nums[i]>k) {
				i++;
			}else {
				i++;
				counter1++;
				//System.out.println(counter1);
				while(i<nums.length && nums[i] == nums[i-1])
					i++;
			}
		}
		return counter1;
	}
public static void main(String [] args) {
	int k = 1;
	int [] nums = {1,2,3,4,5};
	System.out.println(calcPair(nums,k));
}
}
