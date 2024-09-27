/**
Problem: k-differnce pairs

Time Complexity: O(nlogn), where n is the length of the array
Space Complexity : O(1)

Did it run on LeetCode : Yes.
Approach : Two pointers.
1. Sort the array first.
2. The low pointer initially points to 0, and high to 1.
3. If the difference between the numbers at those pointers is less than k, we increment the high pointer. If it is more we increment the low pointer.
4. If it is equal, then we have found one unique pair whose differnce is k.


*/


class Solution {
    public int findPairs(int[] nums, int k) {
       //two pointers
        int low = 0;
        int high = 1;
        int count = 0;
        Arrays.sort(nums);
        while(low < nums.length && high< nums.length) {
            if( low == high || (nums[high] - nums[low]) < k) {
                high++;
            }
            else if((nums[high] - nums[low]) > k) {
                low++;
            }
            
            else {
                count++;
                low++;
                while(low < nums.length && nums[low] == nums[low-1]) {
                    low++; //we don't want duplicates.
                }
            }
        }
        return count;
    }
}