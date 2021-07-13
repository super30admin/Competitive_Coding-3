// Time complexity: O(N), where N is the length of nums array.
// Space complexity: O(N)
// Did this code successfully run on Leetcode : Yes

import java.util.*;
import javafx.util.Pair;

// a - b = k or b - a = k
// a = k + b or a = b - k
class Solution2 {
    public int findPairs(int[] nums, int k) {
        HashSet<Pair<Integer, Integer>> set = new HashSet<>(); 
        HashMap<Integer, Integer> map = new HashMap<>(); 
        for (int i = 0; i < nums.length; i++) {
            // check map for key1
            int key1 = nums[i] - k;
            if (map.containsKey(key1)) {
                int j = map.get(key1);
                // add the elements to set to avoid duplicates
                set.add(new Pair(nums[j], nums[i]));
            }
            // check map for key2
            int key2 = nums[i] + k;
            if (map.containsKey(key2)) {
                int j = map.get(key2);
                // add the elements to set to avoid duplicates
                set.add(new Pair(nums[i], nums[j]));
            }
            // put the element in map.
            map.put(nums[i], i);
        }
        // return the number of pairs in the set.
        return set.size();                 
    }
}
