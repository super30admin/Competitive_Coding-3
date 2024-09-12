// Time Complexity : O(N)
// Space Complexity : O(N) 
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach


/*

    HashMap is used to store numbers and their respective frequencies.
    if k == 0 then we have a special case, since number - itself = 0. 
    If not, we look for key + k in the hashmap.
    Then we increment the count, if that is present.


*/

import java.util.*;
public class KDiffPairsInArray {
    
    public static int findPairs(int[] nums, int k) {
        
        if(nums == null || nums.length == 0)
        {
            return 0;
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i:nums)
        {
            map.put(i, map.getOrDefault(i, 1)+1);
        }

        int count =0;
        for(Map.Entry<Integer,Integer> it: map.entrySet())
        {
            if(k==0)
            {
                if(map.get(it.getKey())>=2)
                {
                    count++;
                }
            }
            else{
                if(map.containsKey(it.getKey()+k))
                {
                    count++;
                }
            }
        }

        return count;

    }


    public static void main(String args[])
    {
        int nums[] = {3,1,4,1,5};
        int k = 2;
        System.out.println(findPairs(nums, k));
    }
}
