// Time Complexity :O(n)- Since Iterating through entire array
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
//Runtime: 7 ms, faster than 93.59% of Java online submissions for K-diff Pairs in an Array.
//Memory Usage: 39.5 MB, less than 94.74% of Java online submissions for K-diff Pairs in an Array.
// Any problem you faced while coding this :Few conditions were missed in the beginning, were taken care off later.


// Your code here along with comments explaining your approach
import java.util.*;
import java.io.*;

class Solution {
    public static int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int left=0; 
        int right=0;
        int count=0;
        //If k is less than 0 return 0 as only absolute difference is calculated
        if(k<0) return 0;
        //Loop through the entire array length
        while(left<n && right<n){  
            //This condition checks if the same value is repeated, if yes move to the next value
            if(left != 0 && nums[left] == nums[left-1]) continue;
            //if the left & right pointer are pointing to the same element, move the right pointer to the next                  element
            if(left==right) right++;
            //If the target value is found, increment the count, left ptr & right ptr
            else if(nums[right] - nums[left] == k){ 
                count++;
                left++;
                while(left<n && nums[left] == nums[left-1]) left++;
                
                right++;
                while(right<n && nums[right] == nums[right-1]) right++; 
                
            }else if(nums[right] -nums[left] > k){
                left++;
                while(left<n && nums[left] == nums[left-1]) left++;
            }else if(nums[right] -nums[left] < k){
                right++;
                while(right<n && nums[right] == nums[right-1]) right++;  
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
    		int[] nums= {3,1,4,1,5};
    		int k=2;
    		System.out.println("Number of pairs: " +findPairs(nums,k) );
    }
}