import java.util.HashMap;
import java.util.Map;

/**
 * I took frequencyMap to maintain the count of occurences of a num in nums.
 * I iterated on the frequencyMap to avoid finding repeated pairs.
 * Considering the key as nums[i], I am looking for nums[j] which is equal to nums[i] - k.
 * nums[j] can also be equal to nums[i] + k. But I'm not looking for it to avoid finding repeated pairs.
 * When nums[i] - k is found I am increasing the result by 1.
 * When k = 0, I need look for repeated numbers since nums[i] - nums[j] = 0 => nums[i] = nums[j].
 */
// Time: N + N ~= O(N)
// Space: O(N) for frequencyMap
class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        // Populate map
        for (int num: nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int numOfPairs = 0;
        // Iterate through key set of the map
        for (Map.Entry<Integer, Integer> entry: frequencyMap.entrySet()) {
            if (k != 0) {
                if (frequencyMap.containsKey(entry.getKey() - k)) {
                    numOfPairs ++;
                }
            } else {
                // As k = 0, look for repeated number
                if (entry.getValue() >= 2) {
                    numOfPairs ++;
                }
            }
        }
        return numOfPairs;
    }
}