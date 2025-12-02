// Time Complexity : O(n) + O(n) ~ O(n) where n is the number of elements 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes, was not able to come up with the solution in the mock interview


// Your code here along with comments explaining your approach
/*
I first counted the number of all the occurences of the numbers. The reason why I counted first is because the 2nd number might be encounter later than the first.
The formula nums[i] - nums[j] == k is equivalent to nums[j] = nums[i] - k. So if k > 0, we  will find the nums[i] - k in the hashmap, if we find it which means the pair satisfies the condition and increment the count.
One thing to note is that if k == 0, then if the number of occurences is greater than 2, it means we found a pair and increment the count.
*/

import java.util.HashMap;
import java.util.Map;

public class KDiffPairs {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int res = 0;

        for(int num : nums) {
            hmap.put(num, hmap.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry : hmap.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();

            if(k == 0) {
                if(val > 1) {
                    res++;
                }
            } else {
                if(hmap.containsKey(key + k)) {
                    res++;
                }
            }
        }

        return res;
    }
}
