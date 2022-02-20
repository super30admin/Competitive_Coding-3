//Time Complexity: O(n log n) due to sorting
//Space Complexity: O(n) depends on sorting algo.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Sort the array
// Take 2 pointer at first and second index p1 and p2.
// Take the difference in value, depending on which increment either p1 or p2.
// To eliminate duplicates increment p1 untill the next element is different when we find a pair.
class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        if(nums.length <= 1)
            return 0;
        int count = 0;
        int p1 = 0 , p2 = 1;
        while(p1 < nums.length && p2 < nums.length){
            if(p1 == p2 || nums[p2] - nums[p1] < k){
                p2++;
            }
            else if(nums[p2] - nums[p1] > k){
                p1++;
            }
            else{
                p1++;
                count++;
                while(p1 < nums.length && nums[p1] == nums[p1-1])
                    p1++;

            }
         }
        return count;
    }
}