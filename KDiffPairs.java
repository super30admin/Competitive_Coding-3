/**
Time Complexity :O(N) 
Space Complexity :O(N)
Did this code successfully run on Leetcode : yes
Any problem you faced while coding this :no
**/
class Solution 
{
    public int findPairs(int[] nums, int k) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        Set<List<Integer>> out = new HashSet<>();
        
        if(nums == null || nums.length == 0)
            return 0;
        
        
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        
        
        for(int i =0; i<nums.length;i++)
        {
            int current = nums[i];
            
            int target1 = k + current;
            int target2 = current - k;
            
            if(map.containsKey(target1))
            {
                int index = map.get(target1);
                if(index != i)
                {
                    Integer pair[] = new Integer[]{nums[i], nums[index]};
                    Arrays.sort(pair);
                    List<Integer> list = Arrays.asList(pair);
                    
                    if(!out.contains(list))
                        out.add(list);
                }
            }
            
            if(map.containsKey(target2))
            {
                int index = map.get(target2);
                if(index != i)
                {
                    Integer pair[] = new Integer[]{nums[i], nums[index]};
                    Arrays.sort(pair);
                    List<Integer> list = Arrays.asList(pair);
                    
                    if(!out.contains(list))
                        out.add(list);
                }
            }
        }
        
        return out.size();
        
    }
    
}