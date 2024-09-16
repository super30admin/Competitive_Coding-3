//https://leetcode.com/problems/k-diff-pairs-in-an-array/

//Time complexity : O(N)
//Space complecity : O(N)
// Did this code successfully run on Leetcode : YES
class Solution {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int e : nums) {
            map.put(e, map.getOrDefault(e, 0) + 1);
        }
        for (int e : map.keySet()) {
            int b = e - k; // e+b = k -> b = e-k
            // Check if b is present
            if (map.containsKey(b)) {
                if (k == 0) {
                    int freq = map.get(e);
                    if (freq > 1) {
                        count++;
                    }
                } else {
                    count++;
                }
            }
        }

        return count;
    }
}