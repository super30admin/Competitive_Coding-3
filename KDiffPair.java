// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Y
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

import java.util.HashMap;
import java.util.Map;

public class KDiffPair {
    public int findPairs(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
         for(int n : nums)
         {
             if(map.containsKey(n))
             {
                 map.put(n, map.get(n) + 1);
             }
             else
                map.put(n, 1);
         }
         for(Map.Entry<Integer,Integer> m : map.entrySet())
         {

             int key = m.getKey();
             int value = m.getValue();

             if(k==0)
             {
                 if(value > 1)
                 {
                     count++;
                 }
             }
             else
             {
                 if(map.containsKey(key+k))
                 {
                     count++;
                 }
             }
         }

         return count;
        }
        public static void main(String[] args)
        {
            int [] nums = {3,1,4,1,5};
            KDiffPair k = new KDiffPair();
            System.out.println(k.findPairs(nums,2));
        }
}
