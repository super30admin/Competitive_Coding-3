// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k < 0) return 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int count=0;
        for(int i=0; i<nums.length; i++)
        {
            map.put(nums[i], i);
        }
        
        for(int i=0; i<nums.length; i++)
        {
            if(map.containsKey(k+nums[i]) && map.get(k+nums[i])!=i)
                count++;
            map.remove(k+nums[i]);
        }
        return count;
    }
}