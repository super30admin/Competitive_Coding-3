// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
  public int findPairs(int[] nums, int k) {
    Map<Integer, Integer> hashmap = new HashMap<>();
    int count = 0;

    for(int i = 0; i<nums.length; i++) {
      hashmap.put(nums[i], hashmap.getOrDefault(nums[i],0)+1);
    }

    for(int num: hashmap.keySet()) {
      if(k==0) {
        if(hashmap.get(num)>1) count++;
      }else {
        if(hashmap.containsKey(num+k)) count++;
      }
    }

    return count;
  }
}