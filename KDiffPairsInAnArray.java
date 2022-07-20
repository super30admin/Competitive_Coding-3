import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0)
            return 0;
        HashMap<Integer, Integer> elements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            elements.put(nums[i], i);
        }
        HashSet<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            Integer complement1 = nums[i] - k;
            Integer complement2 = nums[i] + k;
            if (elements.containsKey(complement1)) {
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                temp.add(complement1);
                Collections.sort(temp);
                if (!result.contains(temp) && elements.get(complement1) != i) {
                    result.add(temp);
                }
            }
            if (elements.containsKey(complement2)) {
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                temp.add(complement2);
                Collections.sort(temp);
                if (!result.contains(temp) && elements.get(complement2) != i) {
                    result.add(temp);
                }
            }

        }
        return result.size();

    }
}