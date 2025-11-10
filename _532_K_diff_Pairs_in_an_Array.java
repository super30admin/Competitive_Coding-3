/**** Method 1 ****/
//Time Complexity: O(n)
//Space Complexity: O(n)

//Successfully submitted in LeetCode

//As we just need count, we can create a frequency HashMap and traverse to find if i-k is present or not if yes we increase count, in edge case where k is zero, for every entry we increment count if their frequency is greater than two, as they can form a pair. At the end return count.

/**** Method 2 ****/
//Time Complexity: O(n)
//Space Complexity: O(n)

//Successfully submitted in LeetCode

//In this solution we try to find all unique pairs and return their count. To find unique pairs, we insert all the values in nums array into a Hashmap with their index, so that we only have unique entries. Next check if pair(val,val-k) and check if map.get(val-k) is not equal to i(This works when k == 0 as we only have unique values) is present or not if yes sort that pair and add it in HashSet<Pair>(to avoid duplicates), do the same with pair(val,val+k).

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**** Method 1 ****/
public class _532_K_diff_Pairs_in_an_Array {

  public int findPairs(int[] nums, int k) {
    int ans = 0;

    HashMap<Integer, Integer> map = new HashMap();

    for (int i : nums) {
      map.put(i, map.getOrDefault(i, 0) + 1);
    }

    for (int num : map.keySet()) {
      int frq = map.get(num);
      if (k == 0) {
        if (frq >= 2) {
          ans++;
        }
      } else {
        if (map.containsKey(num - k)) {
          ans++;
        }
      }
    }

    return ans;
  }

  /**** Method 2 ****/
  public int findPairs1(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], i);
    }

    HashSet<List<Integer>> entryHashSet = new HashSet<>();

    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i] - k) && map.get(nums[i] - k) != i) {
        Integer[] arr = { nums[i], nums[i] - k };
        Arrays.sort(arr);

        entryHashSet.add(Arrays.asList(arr));
      }

      if (map.containsKey(nums[i] + k) && map.get(nums[i] + k) != i) {
        Integer[] arr = { nums[i], nums[i] + k };
        Arrays.sort(arr);

        entryHashSet.add(Arrays.asList(arr));
      }
    }

    return entryHashSet.size();
  }
}
