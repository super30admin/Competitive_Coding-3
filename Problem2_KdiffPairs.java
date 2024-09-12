import java.util.Arrays;

// Time Complexity : o(nlogn)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int findPairs(int[] nums, int k) {
        
      // Aproach 1 using hashmap  
       /* Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
        
        int count=0;
        
        for(int num:nums)
        {
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        
         for(int i: hm.keySet()) {
            if(k==0) {
                if(hm.get(i)>=2)
                    count++;
            }
            else {
                if(hm.containsKey(i+k))
                    count++;
            }
        }
       return count;
    }*/
        
        //Aproach using 2 pointers 
        Arrays.sort(nums);
        int n=nums.length;
        int i=0,j=0;
        
        int count= 0;
        while (j < n) {
            if (i == j) {
                j ++;
            }
            if ((j < n) && (nums[j] - nums[i] == k)) {
                count ++;
                i ++;
                // skip duplicates
                while (i < n && (nums[i] == nums[i - 1])) i ++;
                while (j < n && (nums[j] == nums[j - 1])) j ++;                
            } else if (j < n && (nums[j] - nums[i]) > k) {
                i ++;
            } else {
                j ++;
            }
        }

        return count;
    }
}
