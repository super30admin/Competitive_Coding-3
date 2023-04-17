// https://leetcode.com/problems/k-diff-pairs-in-an-array/

// Time Complexity:  O(n)
// Space Complexity: O(n)

class Solution {
    public int findPairs(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);                                          // frequency map
        }

        for(int key : map.keySet()) {                                                                  // iterating keyset of map
            if((k>0 && map.containsKey(key + k)) || (k==0 && map.get(key) > 1)) {                      // if map has key which is equal to key+k & k>0 OR map has more than one occurance of that key
                result++;
            }
        }

        return result;

    }
}
