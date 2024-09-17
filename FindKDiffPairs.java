import java.util.HashMap;
import java.util.Map;

/**
 * // Time Complexity : O(n)
 * // Space Complexity : O(n)
 * // Did this code successfully run on Leetcode : Yes
 * // Any problem you faced while coding this :
 */

public class FindKDiffPairs {
  public int findPairs(int[] nums, int k) {
    Map<Integer, Integer> Hmap = new HashMap<>();
    int count = 0;
    for (Integer n : nums)
      Hmap.put(n, Hmap.getOrDefault(n, 0) + 1);
    for (Integer key : Hmap.keySet()) {
      if (k == 0 && Hmap.get(key) > 1)
        count++;
      else if (k > 0 && Hmap.containsKey(key + k))
        count++;
    }
    return count;
  }

  public static void main(String[] args) {
    int[] nums1 = { 3, 1, 4, 1, 5 };
    int k1 = 2;
    FindKDiffPairs fDp = new FindKDiffPairs();
    int result1 = fDp.findPairs(nums1, k1);
    System.out.println(result1);

    int[] nums2 = { 1, 2, 3, 4, 5 };
    int k2 = 1;
    int result2 = fDp.findPairs(nums2, k2);
    System.out.println(result2);

    int[] nums3 = { 1, 3, 1, 5, 4 };
    int k3 = 0;
    int result3 = fDp.findPairs(nums3, k3);
    System.out.println(result3);
  }
}
