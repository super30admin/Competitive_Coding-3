// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for (int num : map.keySet()) {
            if (k > 0) {
                if (map.containsKey(num - k)) {
                    count++;
                }
            } else if (k == 0) {
                if (map.get(num) > 1) {
                    count++;
                }
            }
        }

        return count;
    }
}