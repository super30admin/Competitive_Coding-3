import java.util.HashMap;
import java.util.Map;
// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
/*
we prefill a hashmap with frequencies of each number
since we don't want redundant pairs and we are itertaing through map itself we can just look for num+k since every element would be covered
to handle cases when k is 0 we check for the frequencies of each element, if their frequencies are more than 1 then we can form a pair with them.
*/

public class KDifferentPairs {
    public static int findPairs(int[] nums, int k) {
        int count=0;
        //[1,3,1,5,4] k=0
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
            map.put(num,map.getOrDefault(num,0)+1);
       
        for(int num:map.keySet())
        {
            if(k==0 && map.get(num)>1)
                count++;
            if(k>0 &&map.containsKey(num+k))
                count++;
            
        }
        return count;
    }

    public static void main(String[] args)
    {
        int[] nums = {3,1,4,1,5};
        int k = 2;
        System.out.println(findPairs(nums,k));
    }
}
