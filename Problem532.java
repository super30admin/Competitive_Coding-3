// Time Complexity : O(n)  
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public int findPairs(int[] nums, int k) {
        
        HashMap <Integer, Integer> map = new HashMap<>(); // frequency map for nums[i]
        
        int count=0;
        for(int i=0; i<nums.length;i++)
        { 
            
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        
        
       for (int e : map.keySet()) {
            if(k==0)
            {
                if(map.get(e)>1) count++;  
                // for k=0 the difference is of two same numbers so if a number is repated do count++
            }
            else{
                if(map.containsKey(e+k)) //nums[i]+k // here k>=0 as per constraint
                count++;
            }
        }
        return count;
    }
}