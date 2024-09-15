import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

// Time Complexity :O(n)
// Space Complexity :(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :getting started

// Your code here along with comments explaining your approach

public class KDiffPairs {

    class Solution {
        public int findPairs(int[] nums, int k) {
            //Base case
            if (nums.length == 0 || nums == null) return 0;

            //Sort Arrays
            Arrays.sort(nums);

            HashMap<Integer, Integer> map = new HashMap<>();

            //count occurence of numbers
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            int counter = 0;
            //get keys
            Set<Integer> keys = map.keySet();

            for (int key : keys) {
                // case for when k == 0
                if (k == 0) {
                    if (map.get(key) > 1) counter++;
                    //case for when k>0
                } else {
                    if (map.containsKey(key + k)) counter++;
                }
            }
            return counter;
        }
    }
}
