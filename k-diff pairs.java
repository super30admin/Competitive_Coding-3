
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach: We will use a hashmap to store the elements and its frequency.
// Once that is done we look for element+k in the map.

class Solution {
    public int findPairs(int[] nums, int k) {
        int count=0; 
  HashMap<Integer,Integer> map=new HashMap<>();
// Store the frequency of each element in the hashmap
  for(int i=0;i<nums.length;i++)
  {
      map.put(nums[i],map.getOrDefault(nums[i],0)+1);
  }
//Look for element+k in the hashmap by iterating through it
for(int key:map.keySet())
{
    if(k==0)
    {
        if(map.get(key)>1)
        count++;
    }
    else if(map.containsKey(key+k))
    {
count++;
    }
}
return count;
    }
}