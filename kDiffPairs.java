/**
Problem: https://leetcode.com/problems/k-diff-pairs-in-an-array/
TC: O(n)
SC: O(n)
*/
class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> numberFrequencyMap = new HashMap<>();
        int pairs = 0;
        
        for (int i = 0; i < nums.length; ++i) {
            numberFrequencyMap.put(nums[i], numberFrequencyMap.getOrDefault(nums[i], 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> e : numberFrequencyMap.entrySet()) {
            int num = e.getKey();
            int freq = e.getValue();
            if ((k > 0 && numberFrequencyMap.containsKey(num + k)) || (k == 0 && freq > 1)) {
                ++pairs;
            }
        }
        return pairs;
    }
}