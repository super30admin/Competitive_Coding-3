//time complexity : O(N) where n is the number of elements in the array
//space complexity: O(1)
//executed on leetcode: yes

import java.util.*;
public class kDiffPairs {

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