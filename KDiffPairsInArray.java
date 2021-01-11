// Time Complexity : O(n)
// Space Complexity : O(m), m = unique numbers from array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Notes : Create a HashSet to store all unique values from the array, sort the array and check if k plus the current value in array is present in the HashSet, while skipping the duplicate values. If k = 0, we cannot use the HashSet, so we can find the numbers that are duplicated ONCE and count them. 

public class KDiffPairsInArray {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length <= 1) return 0;
        
        Arrays.sort(nums);
        
        //initialize array with a maximum number
        int prev = nums[nums.length-1]+1;
        
        int count = 0; //if k > 0, use this count
        int count0 = 0; //if k = 0, use this count
        
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        
        int duplicate = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != prev){ //if k > 0, then find the required value using a HashSet
                if((set.contains(nums[i] + k))){
                    count = count + 1;
                    duplicate = 1;
                }
            } else { //if k == 0, then count the duplicates only once
                duplicate = duplicate + 1;
                if(duplicate <= 2)
                    count0 = count0 + 1;
            }
            prev = nums[i];
        }
        
        return k == 0 ? count0 : count;
    }
}
