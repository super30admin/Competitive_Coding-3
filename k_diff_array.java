// 532. K-diff Pairs in an Array - https://leetcode.com/problems/k-diff-pairs-in-an-array/
// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums == null) return 0;
        
        // Hashmap -  value, fre
        HashMap<Integer,Integer> map = new HashMap<>();
        
        // for - to stores values into hashmap
        for(int n: nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        // for - search
        int count=0;
        for(int n:map.keySet())
        {   
            //edge case - frequemcy =>2
            if(k==0)
            {
              if(map.get(n)>=2)
              {
                  count++;
              }  
            }
            else
            {
                if(map.containsKey(n+k))
                {
                    count++;
                }
            }
        }
        return count;
    }
}