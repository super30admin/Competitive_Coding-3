/*
Runtime complexity - O(N) - where N is the number of elements in the nums array, but it is two pass
Space complexity - O(N) where N is the number of elements int input array to construct the hash map.
*/


class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums==null || nums.length==0)
            return 0;
        HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int result=0;
        for(Integer key:map.keySet())
        {
            int val=map.get(key);
            if(k>0 && map.containsKey(key+k))
                result++;
            else if(k==0 && val>1)
                result++;
        }
        return result;
    }
}
