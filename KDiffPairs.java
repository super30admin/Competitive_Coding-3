
// 532. K-diff Pairs in an Array
// https://leetcode.com/problems/k-diff-pairs-in-an-array/description/

/**
 * Time Complexity: O(n) since we iterate over each element
 * Space Complexity: O(n) since in worst case we store all elements
 */

class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        int count = 0;

        for(int num : nums){ // count frequency of numbers
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : map.keySet()){ // iterating on keys as we want unique pairs

            int anotherNumber = num + k;

            // if k is 0, we need to check if the same number exists more than once as we cannot consider same number
            if(k == 0){ 
               if(map.get(anotherNumber) > 1){ 
                    count++;
               }
            }else{
               if(map.containsKey(anotherNumber)){
                    count++;
               }                
            }
        }

        return count;
    }
}