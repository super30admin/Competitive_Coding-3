//Time Complexity: O(N)
//Space Complexity: O(N)

class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        if(k<0)
            return 0;
        if(k==0)
        {
           for(int i=0;i<nums.length;i++)
           {
               if(!map.containsKey(nums[i]))
               {
                   map.put(nums[i],1);
               }
               else
               {
                   if(map.get(nums[i]) == 1)
                   {
                       map.put(nums[i],2);
                       ans++;
                   }
               }
               
           }
        }
        else
        {
            for(int i=0;i<nums.length;i++)
            {
                if(!set.contains(nums[i]) && k!=0)
                {
                    set.add(nums[i]);
                    if(map.containsKey(nums[i] - k))
                    {
                        ans++;
                        map.put(nums[i],i);

                    }
                    if(map.containsKey(nums[i] + k))
                    {
                        ans++;
                        map.put(nums[i],i);
                    }
                    else{
                        map.put(nums[i],i);
                    }

                }
                else
                {
                    continue;
                }
            }
        } 
        return ans;
    }
    
}