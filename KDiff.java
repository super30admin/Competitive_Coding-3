// Time Complexity : O(N^2) worst case
// Space Complexity : O(N) 
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) {
        return 0;
    }

    Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    for (int n : nums) {
        map.put(n, map.getOrDefault(n, 0)+1);
    }

    int count = 0;
    if (k == 0) {
        for (Integer key: map.keySet()) {
            if (map.get(key) >= 2) {
                count++;
            }
        }
    } else { 
        for (Integer key: map.keySet()) {
            if (map.containsKey(key+k)) {
                count++;
            }
        }
    }
    return count;
    }
} 