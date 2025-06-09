// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : None
// Your code here along with comments explaining your approach
class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : map.keySet()) {
            if (k == 0) {
                if (map.get(num) >= 2) {
                    count++;
                }
            } else {
                if (map.containsKey(num + k)) {
                    count++;
                }
            }
        }
        return count;
    }
}
