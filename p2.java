// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had to lookup how to iterate over keys and values in hashmap

// Your code here along with comments explaining your approach

class Solution {
    public int findPairs(int[] nums, int k) {
        // To count the number of unique pairs
        int count = 0;
        // Hashmap to store unique elements and its frequency
        Map<Integer, Integer> set = new HashMap<>();

        // Iterate over array and insert values and keys in hashmap
        for (int i = 0; i < nums.length; i++) {
            set.put(nums[i], set.getOrDefault(nums[i], 0) + 1);
            System.out.println(nums[i] + " " + set.get(nums[i]));
        }

        // Handling edge case when k=0.
        if (k == 0) {
            for (Integer v : set.values()) {
                if (v >= 2)
                    count++;
            }
            return count;
        }

        // Iterating through the keys to avoid duplicates if we iterate over the array
        for (Integer key : set.keySet()) {
            // Get the compliment and see if the compliment is there or not in hashmap
            int comp = key + k;
            if (set.containsKey(comp))
                count++;
        }

        return count;
    }
}