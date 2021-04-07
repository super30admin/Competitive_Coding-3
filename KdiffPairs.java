// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

public class Solution {
    public int findPairs(int[] nums, int k) {

        int result = 0;

        HashMap<Integer, Integer> counter = new HashMap<>();
        // insert all values in hashmap
        for (int n : nums) {
            counter.put(n, counter.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            // get each key and its no. of occurences
            int x = entry.getKey();
            int val = entry.getValue();
            // check if sum of each value with k is present
            if (k > 0 && counter.containsKey(x + k)) {
                result++;
            }
            // Handle cases when k==0 and we have a pair of same elements
            if (k == 0 && val > 1) {
                result++;
            }
        }
        return result;
    }
}