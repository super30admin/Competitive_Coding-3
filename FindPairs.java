/* Time Complexity :  O(n)
   Space Complexity :  O(n)
   Did this code successfully run on Leetcode : Yes
   Any problem you faced while coding this : No
   Method: HashMap
*/
class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                if(k==0 && hm.get(nums[i])==1) res++; //If same value, count only once.
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else
            {
                if(hm.containsKey(nums[i]-k))
                {
                    res++;
                }
                if(hm.containsKey(nums[i]+k))
                {
                    res++;
                }
                
                hm.put(nums[i],1);
            }
        }
        return res;
    }
}