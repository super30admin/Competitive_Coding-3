//leetcode - 532
//time - O(n)
//space - O(n)
//another approach - sorth the array and foe each element do a binary search to get target and increment result to get a time of nlogn with constant space

class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k < 0)
        {
            return 0; //absolute difference is k and it cant be -ve
        }
        
        HashMap<Integer, Integer> map = new HashMap<>(); //map of element -> index
        int result = 0;
        
        if(k == 0)
        {
            //reduces to find duplicates
            //[3, 1, 4, 1, 5] with k = 0 has one pair (1, 1) so ouput is 1
            HashSet<Integer> duplicates = new HashSet<>();
            for(int i = 0; i < nums.length; i++)
            {
                if(map.containsKey(nums[i])) //duplicate element
                {
                    if(!duplicates.contains(nums[i])) //this set avoids double counting
                    //eg test case - [1, 1, 1, 1, 1] with k = 0 should return 1
                    {
                        result++;
                        duplicates.add(nums[i]);
                    }
                }
                map.put(nums[i], i);
            }
             return result;
        }
        
        for(int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], i);
            //in case of duplicates in nums, map has the largest index of that duplicate
        }
        
        for(Integer num : map.keySet())
        {
            int target = num + k;
            //no need to find num - k as it will be handles automatically
            if(map.containsKey(target))
            {
                result++;
            }
        }
        
        return result;
    }
}
