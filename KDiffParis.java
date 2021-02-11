import java.util.Arrays;

// Time Complexity :  O(n) where n is the size of the array
// Space Complexity : O(q) where q is the number of unique elements in the input array
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No


	public class  KDiffParis {
		  public int findPairs(int[] nums, int k) {
		        Arrays.sort(nums);
		        int slow =0,fast=0,count=0;
		        int n = nums.length;
		        while(slow<n && fast<n)
		        {
		            if(slow==fast || nums[fast]-nums[slow]<k) fast++;
		            else if(nums[fast]-nums[slow]>k) slow++;
		            else
		            {
		                count++;
		                fast++;
		                while(fast<n && nums[fast]==nums[fast-1]) fast++; //maintaining uniquness
		            }
		        }
		        return count;
		    }
		    public static void main(String[] args) {
		        kDiffPairs obj = new kDiffPairs();
		        int[] nums = new int[]{1, 3, 1, 5, 4};
		        System.out.println(obj.findPairs(nums, 0));
		    }
		} 