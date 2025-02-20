/*Time Complexity: O(nlogn) because of sorting.
Space Complexity: O(1) no extra space.
Leetcode: yes
Any Issues: NO
*/
import java.util.*;
class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0, j=i+1;
        int count = 0;
        while(i<nums.length && j<nums.length)
        {
            int diff = nums[j] - nums[i];
            if(i == j  || diff < k)
                j++;

            else if(diff > k)
                i++;
            else
            {
                i++;
                count++;
                while(i<nums.length && nums[i] == nums[i-1])
                    i++;
            }
        }
        return count;
    }
}