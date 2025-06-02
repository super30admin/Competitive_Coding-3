// TC: O(n)
// SC: O(n)
// Approach: Create a frequency map. Iterate through the frequency map to check if 
// the element + k exists in map, if yes increase that count also check that k is not 0 
// and if k is 0 there the frequency of element should be greater than 1.

import java.util.HashMap;
import java.util.Map;

public class KDiffPairsInArray {

  public int findPairs(int[] nums, int k) {

    HashMap<Integer, Integer> map = new HashMap<>();
    int count = 0;

    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if ((map.containsKey(entry.getKey() + k) && k != 0) || (k == 0 && entry.getValue() > 1)) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    KDiffPairsInArray kdp = new KDiffPairsInArray();

    int[] nums = new int[] { 3, 1, 4, 1, 5 };
    int k = 2;

    System.out.println(kdp.findPairs(nums, k));
  }
}
