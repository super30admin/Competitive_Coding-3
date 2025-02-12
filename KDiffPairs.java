// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        int target = 0;

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (int num : map.keySet()) {
            if (k == 0) {
                target = num;
                if (map.containsKey(target) && map.get(target) > 1) {
                    result++;
                }
            } else {
                target = num + k;
                if (map.containsKey(target)) {
                    result++;
                }
            }
        }
        return result;
    }
}