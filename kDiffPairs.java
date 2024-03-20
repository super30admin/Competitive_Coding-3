// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],1);
            }
            else
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        int count=0;
        for(Integer key:map.keySet())
        {
            if(k==0 && map.get(key)>1)
            {
                count++;
            }
            else if((k>0) && map.containsKey(key-k))
            {
                count++;
            }
        }
        return count;
            }
}