/*
 * #532. K-diff Pairs in an Array
 * 
 * Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array. Here a k-diff pair is defined as an integer pair (i, j), where i and j are both numbers in the array and their absolute difference is k.

Example 1:

Input: [3, 1, 4, 1, 5], k = 2

Output: 2

Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.

Example 2:

Input:[1, 2, 3, 4, 5], k = 1

Output: 4

Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).

Example 3:

Input: [1, 3, 1, 5, 4], k = 0

Output: 1

Explanation: There is one 0-diff pair in the array, (1, 1).

Note:

1. The pairs (i, j) and (j, i) count as the same pair.
2. The length of the array won't exceed 10,000.
3. All the integers in the given input belong to the range: [-1e7, 1e7].

 */


/*
 * Time Complexity: O (N) -> O (N) + O (N) -> O (2N) -> Two for loops, one for creating frequency map and other for traversing through keys of a map
 * 
 * Space Complexity: O (N) -> Creating a HashMap to store 'n' number of elements from input array
 * 
 * Did this code successfully run on leetcode: Yes
 * 
 * Any problem you faced while coding this: No
 * 
 */

package com.s30.edu.competitivecoding3;

import java.util.HashMap;

public class FindPairs {
	public int findPairs(int[] nums, int k) {
		// Base Condition
		// Check if 'nums' length is zero or the k is negative
		// k cannot be negative, since that is the absolute difference (always positive)
		// In this cases, return 0
	    if(nums == null || nums.length == 0 || k < 0){
	        return 0;
	    }
	    
	    int count = 0; // Initialize the number of pairs to '0'
	    
	    // Create a HashMap 
	    HashMap<Integer, Integer> map = new HashMap<>();
	    
	    // Create a frequency map
	    // Key = number in an array
	    // Value = frequency of that number in an array, how many times occurred?
	    for(int n : nums){
	        map.put(n, map.getOrDefault(n,0)+1);
	    }
	    
	    // Traverse through the keys in map
	    // If k = 0, means duplicate of a number should exist in a map
	    // In that case we check if value is at least 2, >= 2 and increment count
	    
	    // IF k > 0, then check if other number in a pair exist in keyset of a map
	    // We check other number by doing key + k
	    // IF yes, then increment count
	    for(int n : map.keySet()){
	        if(k == 0){
	            if(map.get(n) >= 2){
	                count++;
	            }
	        }
	        else{
	            if(map.containsKey(n+k)){
	                count++;
	            }
	        }
	    }
	    
	    return count; // return the number of pairs with absolute difference of 'k'
	
   }

}
