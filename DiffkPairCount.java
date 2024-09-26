/**
 * time complexity is O(nLogn)
 * space complexity is O(n)
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        Set<Integer> seen = new HashSet<>();
        int count = 0;
        for(int num : nums) {
            if(!seen.contains(num) && set.contains(num-k) )  {
                count++;
                seen.add(num);
            }
            set.add(num);
        }
        return count;
        
    }
}