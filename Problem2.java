//Time Complexity: O(n).
//Space Complexity: O(n).

//Since a hasMap is created, extra space is required. The key here is to keep in mid that whenever unique elements are required it is needed to use hashmap or hashset. Whenever diff is required, always keep in mind to add the "k or target" like 2sum and all. 


class Solution {
    public int findPairs(int[] nums, int k) {
        if(k < 0)
            return 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            else
                map.put(nums[i], map.get(nums[i])+1);
        }
        
        int result = 0;
        for(Integer n: map.keySet()){
            if (k == 0)
            {
                if (map.get(n) >= 2)
                    result ++; 
            }
            else
            {
                if(map.containsKey(n+k))
                    result++;
            }
                
        }
       return result;
    }
}