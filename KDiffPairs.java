package com.ds.rani.hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array. Here a k-diff pair is defined as an integer pair (i, j), where i and j are both numbers in the array and their absolute difference is k.
 *
 * Example 1:
 * Input: [3, 1, 4, 1, 5], k = 2
 * Output: 2
 * Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
 * Although we have two 1s in the input, we should only return the number of unique pairs.
 * Example 2:
 * Input:[1, 2, 3, 4, 5], k = 1
 * Output: 4
 * Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
 * Example 3:
 * Input: [1, 3, 1, 5, 4], k = 0
 * Output: 1
 * Explanation: There is one 0-diff pair in the array, (1, 1).
 * Note:
 * The pairs (i, j) and (j, i) count as the same pair.
 * The length of the array won't exceed 10,000.
 * All the integers in the given input belong to the range: [-1e7, 1e7].
 */

//Approach: Use hashmap,put numbers and how many times it ocurred in an array in one pass
//In second pass, traverse over map, take key, add k into it and check if map contains that value,if yes then increase counter

//TimeComplexity:o(n) where n is arr length
//Space Complexity: o(n)
public class KDiffPairs {
    public int findPairs(int[] nums, int k) {
        //Edge case
        if(nums==null || nums.length==0 || k<0)
            return 0;

        int pairsCount=0;
        Map<Integer,Integer> map=new HashMap<>();
        //Add value and how many times it occured in an array
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                //count how many elements in the array that appear more than twice.
                if (entry.getValue() >= 2) {
                    pairsCount++;
                }
            } else {
                if (map.containsKey(entry.getKey() + k)) {
                    pairsCount++;
                }
            }
        }

        return pairsCount;
    }
}
