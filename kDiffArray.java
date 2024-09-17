// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

import java.util.HashMap;

public class kDiffArray {
    public static void main(String args[]) {
        int[] nums = {3,1,4,1,5};
        int k = 2;
        // create a hash map to store the freuency count for the numbers in the array
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i]))
            {
                map.put(nums[i],1);
            }
            else {
                map.put(nums[i],map.get(nums[i]) + 1);
            }    
        }
        
        // if the key + k is present which is y = k + x. So for difference we see the addition part to find the other number present
        // in the hashmap
        if (k > 0) {
        for(int key: map.keySet()) 
        {
            if(map.containsKey(key + k))
                count++;     
        }
        }
        else {
            // edge case if k is zero then return the number with one or more duplicates to form a unique pair.
            for(int key: map.keySet()) 
        {
            if(map.containsKey(key + k) && map.get(key + k) >=2)
                count += 1;     
        }
        }
        System.out.println(count);
    }
    
}
