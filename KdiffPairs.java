// Time Complexity: O(n)
// Space Complexity: O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/** 
 * The edge case where k=0 is handled by checking if the frequency of the number is greater than 1. Because only pairs with the same number can have a difference of 0.
 * The case where k>0 is handled by checking if the map contains the key (i + k).
 * Since it is a difference we don't need to check for (i - k) as it will be covered when we check for (i + k) for some other number as we should not count duplicates.
 */


import java.util.HashMap;
import java.util.Map;


class KdiffPairs {
    public int findPairs(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap();
 			for (int num : nums)
 				map.put(num, map.getOrDefault(num, 0) + 1);

 			int result = 0;
 			for (int i : map.keySet())
 				if (k > 0 && map.containsKey(i + k) || k == 0 && map.get(i) > 1)
                {
 				   	result++;
                }
 			return result;
    }
}