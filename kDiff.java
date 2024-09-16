// Time Complexity : O(n log n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Using pointers to ensure pairs are unique.

public class kDiff {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        int len = nums.length;
        //null case
        if(nums == null || len < 1) return 0;
        
        Arrays.sort(nums);
        
        int p1 = 0;
        int prevNum = Integer.MAX_VALUE;
        
        for(int p2 = 1; p2 < len; p2++) {
            while(p1 < p2 && (nums[p2] - nums[p1] > k)) {
                p1++;
            }
            
            if(p1 != p2 && (nums[p2] - nums[p1] == k) && prevNum != nums[p1]) {
                count++;
                prevNum = nums[p1];
            }
        }
        
    return count;
    }
    
}
