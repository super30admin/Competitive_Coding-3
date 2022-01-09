// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int findPairs(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
           map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        // traverse through the HashMap to check for k-difference
        for(int n: map.keySet()) {
            // if difference is greater than 0; then check for the (difference + current element) key
            // or if difference is equal to zero and current elemnt's frequency is greater than 1
            // (since frequency = 1  means no 0-diff pair possible)
            
            if(k > 0 && map.containsKey(n + k) || k == 0 && map.get(n) > 1) {
                count++;
            }
        }
        
        return count;
    }
}