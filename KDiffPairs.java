// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach: create a hashmap of nums[i] and it's frequency. Iterate over the entrySet. 
// If k is 0, then we check if the frequency of that key is more than 1, if it's true, 
// we increment result only once as we need unique pairs only.
// If k isn't 0, we consider every element only once and increment the result if
// we find a key in map which is k + currentKey.

// LC- 532. K-diff Pairs in an Array

import java.util.*;

public class KDiffPairs {
  public int findPairs(int[] nums, int k) {
    if (nums == null || nums.length <= 1) {
      return 0;
    }

    int result = 0;

    HashMap<Integer, Integer> map = new HashMap<>();
    for (int n : nums) {
      map.put(n, map.getOrDefault(n, 0) + 1);
    }

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      int key = entry.getKey();
      int val = entry.getValue();

      if (k > 0 && map.containsKey(key + k)) {
        result++;
      } else if (k == 0 && val > 1) {
        result++;
      }
    }
    return result;
  }
}
