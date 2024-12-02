// Time Complexity = O(n)
// Space Complexity = O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Traverse the nums array and add the element to the hashMap with <element_value, count>.
// Do another loop of the keySet of the map and if for k>0 if (key-k) is present in the map, then increment count, also if k==0 and there are more than one key increment count.
class Solution {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k<0) return 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        int count=0;
        for (int i: map.keySet()) {
            if ((k>0 && map.containsKey(i-k)) || (k==0 && map.get(i)>1)) {
                count++;
            }
        }
        return count;
    }
}