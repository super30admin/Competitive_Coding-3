// Time Complexity : O(n) where n is the number of elements in the array
// Space Complexity : O(n) using the hashmap to store the counts of each of the elements
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Faced a major challenge for handling the Duplicates in count and at k = 0(edge case)
/*Algorithm: Store the hashmap with the elements and their count of their occurances. Then parse through hashmap, if k > 0, check if the addition
of k and key exists in the hashmap or not. If it does, increment counter.(Why only addition -> because even if you do k - nums[i], if it exists, you add k to (k-nums[i]),
that will be found on hashmap). If k = 0, which is a special case, then it makes sense to fetch the elements with count > 1 because, those elements 
are having a difference k of 0 on itself. Increment the counter by one only to avoid duplicates.
*/
class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> store = new HashMap<Integer, Integer>();
        if(nums.length == 0 || nums ==null || nums.length == 1 || k <0){return 0;}      // edge case
        int count =0;
        int i = 0;
        while(i < nums.length){
            store.put(nums[i], store.getOrDefault(nums[i], 0) + 1);                 // Store the element and their occurances
            i++;
        }
        for(int j : store.keySet()){
          if(k>0 && store.containsKey(k+j)) {                                   // Check if the addtion between k and nums[i]/key exists
                 count++;
             } else if(k==0 && store.get(j) > 1){                               // Special case of k == 0, increment count only once to avoid duplicates
              count++;
          }
        }
        return count;                                                           // Return the counter
    }
}