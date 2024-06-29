// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) {
            return 0;
        }
        int count = 0;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1); // storing occurences of all numbers in the hashmap
        }
        for (int temp : map.keySet()) { // iterating over the hashmap
            if (k == 0) {
                if (map.get(temp) >= 2) { // occurence more than 2 means 9 - 9 = 0. Diff exists
                    count++;
                }
            }else if (map.containsKey(temp - k)) {
                count++;
            }

        }
        return count;
    }
}