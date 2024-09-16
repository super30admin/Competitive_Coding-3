// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Misunderstood the meaning of unique pairs. and ubale to come
// up for k == 0 case.

// Your code here along with comments explaining your approach

class Solution {
    public int findPairs(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap();
        int count = 0;
        
        for(int i = 0 ; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        
        for(int x : map.keySet()) {
            if(k > 0 && map.containsKey(x + k))
                count++;
            else if(k == 0 && map.get(x) > 1)
                count++;
        }
        return count;
    }
}