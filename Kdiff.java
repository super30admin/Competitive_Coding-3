class Solution {
    /**
     * Hashmap solution: This is kind of 2sum problem. Create map of number and frequency of thise numbers. Iterate over map and find (current value + K) in map. Only special case is k=0, We need values in that case. If we have more than 1 same values then increment result.
     * TC: O(n)
     * space: O(n)
     */
    public int findPairs(int[] nums, int k) {
        int result = 0;
        if (nums == null || nums.length == 0) {
            return result;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        // map -> num: frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            int complement = k + key;
            if (k > 0 && map.containsKey(complement)) {
                result++;
            } else if (k == 0 && value > 1) {
                result++;
            }
        }
        return result;
    }
}
