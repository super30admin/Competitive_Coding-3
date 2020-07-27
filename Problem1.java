// Time Complexity : O(2n) = O(n)
//      n: number of elements
// Space Complexity : O(n)
//      n: number of elements
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

import java.util.HashMap;
// Your code here along with comments explaining your approach
// 1. Create frequency map
// 2. find nums[i] - k in the map, as k = nums[i] - num[j]
// 3. Handle case for k=0


class Problem1 {

    /** find pair whose absolute difference is k */
    public int findPairs(int[] nums, int k) {
        
        // count
        int resultCount = 0;
        
        // edge case
        if(nums==null || nums.length ==0 || k <0)
            return resultCount;
        
        // frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // add all element in the map
        for(int element:nums){
            
            if(!map.containsKey(element))
                map.put(element, 0);
            
            int count = map.get(element);
            map.put(element, ++count);
        }
        
        // iterate map keys
        for(int element:map.keySet()){
            
            // difference should be equal to some other key
            int key = element-k;

            // special case k is 0 
            //  so i!=j meaning frequency should be > 1
            if(k==0){
                if (map.containsKey(key) && map.get(key)>1)
                    resultCount++;
            }
            else if (map.containsKey(key))
                resultCount++;
        }

        // return result
        return resultCount;
    }
}