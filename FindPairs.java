// Time Complexity : O(n)
// Space Complexity : O(n1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
    In the first pass we iterate through the array and find th count of all the numbers.
    In te second pass we iterate through the map and find if (i+k) is a part of the map.    
*/

class Solution {
    public int findPairs(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for (int i : nums)
            map.put(i,map.getOrDefault(i,0)+1);
        
        int count = 0;
        for (int i : map.keySet())
            if((k==0 && map.get(i)>1)||(map.containsKey(i+k))) count++;
        
        return count;
    }
}