// Time Complexity : O(n) --> where n is the length of input array
// Space Complexity : O(n)
// Did this code successfully run on Leetcode (532): Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0) return 0;
        if (k < 0) return 0;
        int count;
		
        if (k == 0) {
            count= 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    map.put(nums[i], map.get(nums[i]) + 1);
                }
                else map.put(nums[i], 1);
            }        
            for (int i: map.keySet()) {
                if (map.get(i) > 1) count++;
            }  
            return count;
        }
        
        count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i : set) {
            if (set.contains(k + i)) count++;
        }
        return count;
    }
}