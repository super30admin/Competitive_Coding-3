// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
//Storing the value in hashmap and then cchecking if target+current num is in the hashmap, if target is zero we just check all number with count >1.
class Solution {
    public int findPairs(int[] nums, int k) {
        int count=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++)
              map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        
           for(int n: map.keySet())
           {
               if((k>0 && map.containsKey(n+k)) || (k==0 && map.get(n)>1) )
                   count++;
           }
        return count;
    }
}