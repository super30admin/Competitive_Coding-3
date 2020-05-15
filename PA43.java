//Leetcode 532. K-diff Pairs in an Array
//Time Complexity : O(nlogn) // for soting O(nlogn) and O(n) for iterating over array nums 
//Space Complexity: O(n) // n is length of nums

class Solution {
    public int findPairs(int[] nums, int k) {
        
        int count =0;
        if(nums==null || nums.length<2 || k<0){
            return count;
        }
        Arrays.sort(nums);
        HashSet<Integer> hs= new HashSet<>();       
        int fl=0;
        if(k==0){            
            for(int i: nums){
                if(hs.contains(i)){
                   if(fl<1) {
                    fl++;
                    count++;
                   }
                }
                else{
                    fl=0;
                    hs.add(i);
                }
            }
            return count;
        }

                for(int i=0; i<nums.length;i++)
            {
                if(!hs.contains(nums[i]) && hs.contains(nums[i]-k)){

                    count++;
                }

                    hs.add(nums[i]);

            }          
        return count;        
    }
}