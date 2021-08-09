// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
/*Approach
1) we iterate over the array and store the occurences
2) now we iterate over map and not array, as we might end up getting duplicates 
3) its same like 2 sum num1-num2==k, where k is the difference thus if we find the key -k in map we know one pair is already present in map and we just increase the count.
and thus return the count in the end.


*/

import java.util.*;

class Solution {
    public int findPairs(int[] nums, int k) {
       
        int count =0;
        //[2,2,2] 
        Map<Integer,Integer> map = new HashMap();
        
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        for(Map.Entry<Integer,Integer> map2: map.entrySet())
        {
            int key= map2.getKey();
            int value = map2.getValue();
            
            
            if(k==0)
            {
                if(map2.getValue()>1)
                {
                    count++;
                }
            }
            else 
            {
                if(map.containsKey(key-k))
                {
                    count++;
                }
            }
            
           
        }
        
         return count;
    }
}