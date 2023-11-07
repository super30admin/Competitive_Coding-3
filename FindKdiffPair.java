// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * As brute force takes n^2 we use hashset to store numbers only once as we dont need duplicate pairs. We the iterate
 * over the nums and check if set has num + k value, thus increment pair. There is one edge case where k is 0
 * we use hashmap to store number and  it frequency and if frequenct is greater than 1 we increment pair.
 */
import java.util.HashMap;
import java.util.HashSet;

public class FindKdiffPair {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length < 1) {
            return 0;
        }
        int pair = 0;
        if(k != 0) {
            HashSet<Integer> set = new HashSet<>();
            for(int num : nums) {
                set.add(num);
            }
            for(int num : set) {
                if(set.contains(num + k)) {
                    pair++;
                }
            }
        }
        else {
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            for(int val : map.values()) {
                if(val > 1) {
                    pair++;
                }
            }
        }
        return pair;
    }
}
