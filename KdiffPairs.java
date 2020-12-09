// Time Complexity : O(N) , N is number of elements in nums
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NA


// Your code here along with comments explaining your approach

class Solution {
    public int findPairs(int[] nums, int k) {
        
        int result = 0;

        HashMap <Integer,Integer> map = new HashMap<>();
        
        for (int n: nums) {
            map.put(n, map.getOrDefault(n, 0)+1);
        }


        for (int x: map.keySet()) {
            if ( (k > 0 && map.containsKey(x + k) ) || (k == 0 && map.get(x) > 1) ) {
                result++;
            } 
        }
        return result;
        
    }
}