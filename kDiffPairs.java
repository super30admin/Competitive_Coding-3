// Time Complexity : O(n) where n is the length of nums array
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

// Hashing is used to count the occurence and check the other values whose difference is the target k

class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer>  map = new HashMap<>();
        int count =0;
        for(int n:nums)
            map.put(n,map.getOrDefault(n,0)+1);
        for(int i:map.keySet()){
            if(k > 0 && map.containsKey(i+k)) count++;
            if(k == 0 && map.get(i) > 1) count++;
        }
        return count;
    }
}
