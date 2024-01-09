class Solution {
    //TC: O(n)
    //SC: O(n)
    public int findPairs(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        Map<Integer, Integer> map= new LinkedHashMap<>();
        for (int i =0; i < n; i++)  //map contains elememt and frequency
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],1);
            }else{
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        for(Integer key:map.keySet())
        {
            if((k == 0) && map.get(key) > 1 || (k > 0) && map.containsKey(key-k)) count++;  //if there are repeated elements and target-nums[i] contains or not
        }
        return count;
    }
}