// Approach: Create a map with the unique elements of the array as keys and their corresponding frequencies as values. Iterate through the
// key set and search for (key + k) in the map, incrementing the count for each successful search. If k is 0, the frequency of the key must
// be greater than 1 to avoid counting the same number as a pair with itself.
// Time Complexity: O(n)
// Space Complexity: O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.Map;
import java.util.Set;
import java.util.List;

import java.util.HashMap;
import java.util.HashSet;

public class KDiffPairs {

    int countBF(int[] arr, int k) {
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) == k) {
                    set.add(List.of(Math.min(arr[i], arr[j]), Math.max(arr[i], arr[j])));
                }
            }
        }
        return set.size();
    }

    int count(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        // integer to it's frequency map
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int count = 0;
        for (int key : map.keySet()) {
            if (k != 0 && map.containsKey(key + k) || k == 0 && map.get(key) > 1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        KDiffPairs kdp = new KDiffPairs();
        int[] arr = { 5, 4, 2, 3, 3, 1, 1 };
        int k = 2;
        System.out.println("Number of unique pairs with difference " + k + " are: " + kdp.count(arr, k));
    }
}