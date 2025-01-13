
/**
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * 
 */

import java.util.HashMap;
import java.util.Map;

public class KDiffPairs {
  public int findPairs(int[] nums, int k) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    Map<Integer, Integer> map = new HashMap<>();
    int count = 0;
    for (int num : nums) {
      if (!map.containsKey(num)) {
        map.put(num, 0);
      }
      map.put(num, map.get(num) + 1);
    }

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      int key = entry.getKey();
      int value = entry.getValue();
      if (k == 0 && map.get(key) > 1) {
        count++;
      } else if (k > 0 && map.containsKey(key + k)) {
        count++;
      }
    }
    return count;
  }
}
