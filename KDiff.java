// Time Complexity : O(n) is length of nums array 
// Space Complexity :O(n) is length of nums array 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class KDiff {
    public int findPairs(int[] nums, int k) {
        if(nums==null || nums.length==0 || k<0) return 0;
       Map<Integer,Integer> map = new HashMap<>();
       Set<List<Integer>> result = new HashSet<>();
        
        for(int i=0;i<nums.length;i++)
        {  
         map.put(nums[i],i);
        }

        
        for(int i=0;i<nums.length;i++)
        {
            List<Integer> list = new ArrayList<>();
            
            if(map.containsKey(nums[i]+k) && i!=map.get(nums[i]+k))
            {
                list.add(nums[i]);
                list.add(nums[i]+k);
                if(!result.contains(list))
                   {
                    result.add(list);
                }
            }
        
            if(map.containsKey(nums[i]-k) && i!=map.get(nums[i]-k))
            {
                list = new ArrayList<>();
                list.add(nums[i]-k);
                list.add(nums[i]);
                if(!result.contains(list))
                {
                    result.add(list);
                }
            }
                
        }
        System.out.println(result);
        return result.size();
    }
}

