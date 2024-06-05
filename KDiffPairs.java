//Time Complexity - O(n log n)
//Space Complexity - O(1)
//Approach - We use a Two pointer approach in this problem. Begin by sorting the array and fix the left and right points to be the first and second element in the array. 
//If the difference is less than k, then increment right pointer else increment the left pointer. 
//When the exact difference is found, we increment count and the left pointer as it does not make sense to increase the right pointer ( elements after right will either be = or > than current right so difference will become more. )
//Avoid duplicates by checking if left's neighbour is not the same number as a sorted list have duplicates grouped together. 
import java.util.*;
class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = 1;
        int count = 0;
        while(left < nums.length && right < nums.length){
            if(left == right || nums[right] - nums[left] < k){
                right++;
            }
            else if(nums[right] - nums[left] > k){
                left++;
            }
            else{
                count++;
                left++;
                while(left < nums.length && nums[left] == nums[left - 1]){
                    left++;
                }
            }
        }
      return count;   
    }
}

        