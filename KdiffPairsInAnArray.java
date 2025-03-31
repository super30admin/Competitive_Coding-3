// Time Complexity : O(n log n) + O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

// Approach:
// 1. Sort the array and use a HashMap to count occurrences of elements while checking for k-difference pairs.
// 2. If k > 0, check for pairs where nums[i] - k exists; if k == 0, count elements appearing at least twice.
// 3. Use a HashMap to efficiently track elements and their frequencies.


import java.util.*;

public class KdiffPairsInAnArray {    
    public int findPairs(int[] nums, int k)
    {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
        int op =0;
        for(int i=0;i<nums.length;i++)
        {   
            if(!map.containsKey(nums[i]))
            {
                if(map.containsKey(nums[i]-k))
                {
                    op++;
                }
            }
            if(!map.containsKey(nums[i]))
            {
                {
                    map.put(nums[i],1);
                }
            }
            else
            {
                int get = map.get(nums[i]);
                map.put(nums[i],get+1);
            }
        }
        if(k==0)
        {
            for(Map.Entry<Integer,Integer> m : map.entrySet())
            {
                if(m.getValue()>=2)
                {
                    op++;
                }
            }
        }
        return op;
    }
}
