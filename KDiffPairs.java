import java.util.HashMap;
import java.util.Map;

//Time Complexity : O(N)
//Space Complexity : O(N)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

/**Put Every element in the map, while putting check if
 * current element +/- k is already available in the map.
 * If so, increment count for each case of + & - and the 
 * put the element in the map with 1 count, if not already present.
 * If already present, just update the map and if k = 0,
 * then we have to increment count by 1 since the current value is from
 * different index and subsequent indices need not be updated as that 
 * will be duplicate. Return count.
 *
 */
class Solution {
	public int findPairs(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for (int num : nums) {
			if (!map.containsKey(num)) {
				if (map.containsKey(num - k))
					count++;
				if (map.containsKey(num + k))
					count++;
				map.put(num, 1);
			} else {
				map.put(num, map.get(num) + 1);
				if (k == 0 && map.get(num) == 2)
					count++;
			}
		}
		return count;
	}
}