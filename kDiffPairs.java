// Time Complexity : O(n)
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// The 2 diff pairs can be (n, n+k) or (n, n-k) where the two numbers cannot be equal.
// To solve this problem, I can iterate over my nums array and keep pushing my element in a set.
// Set takes care of duplicate values and we need not worry about those. On encountering an already existing compliment in the set i.e. either n+k or n-k, I know that I have found a pair.
// I'll add the smaller element in another set : pair which will keep track of unique pairs only. 

class Solution {
    public int findPairs(int[] nums, int k) {
        //edge case :  since k is absolute value, it cannot be negative
        if(nums == null || nums.length == 0 || k < 0) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> pair = new HashSet<>();
        for(int n : nums) {
            if(set.contains(n+k)) pair.add(n);
            if(set.contains(n-k)) pair.add(n-k);
            set.add(n);
        }
        return pair.size();
    }
}