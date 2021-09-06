// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0)
            return 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int num = entry.getKey();
            int val = entry.getValue();
            if(k > 0 && map.containsKey(num + k))
                count++;
            else if(k == 0 && val > 1)
                count++;
        }
        return count;
    }
}