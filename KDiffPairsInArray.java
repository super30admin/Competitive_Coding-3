// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/**
 * if k negative, return 0 as k is absolute difference
 * since k is absolute difference, 2 complements possible, 
 * check if any number for those complements is seen, one of the complement 
 * and current number to another set, second set will contain count of all distinct
 * k diff pairs
 */
/**
 * https://leetcode.com/problems/k-diff-pairs-in-an-array/
 */
import java.util.HashSet;
import java.util.Set;

public class KDiffPairsInArray {
	public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;
        
        if(k < 0) return 0;
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
      
        for(int num: nums) {
                
            int complement = num + k;
            
            if(set1.contains(complement)) {
                set2.add(complement);
            }
            
            complement = num - k;
            
            if(set1.contains(complement)) {
                set2.add(num);
            }
            
            set1.add(num);
        }
        
        return set2.size();
    }
}
