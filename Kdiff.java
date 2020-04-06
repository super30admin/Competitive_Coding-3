// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
import java.util.HashMap;

public class Kdiff {
    public int findPairs(int[] nums, int k) {
        int output = 0;
        //edge case
        if(nums==null || nums.length ==0 || k < 0) return output;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i <nums.length;i++)
        {
            map.put(nums[i],i);
        }
        for(int i = 0 ; i <nums.length;i++)
        {
            if(map.containsKey(k+nums[i]) && map.get(k+nums[i])!=i)
                output++;
            map.remove(nums[i]+k);
        }
        
        return output;
    }
    public static void main(String [] args)
    {
        System.out.println(new Kdiff().findPairs(new int[]{1,2,4,6,7}, 2));
    }
}