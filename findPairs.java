class Solution {

    public int findPairs(int[] nums, int k) {
        // If k is negative, return 0 as no pairs can have a negative difference
        if (k < 0) return 0;

        // Create a map to store the frequency of each number in the array
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 0; // Initialize count to track the number of unique pairs

        // Iterate through the keys of the map
        for (int num : map.keySet()) {
            if (k == 0) {
                // For k = 0, count elements that appear more than once
                if (map.get(num) > 1) {
                    count++;
                }
            } else {
                // For k > 0, check if num + k exists in the map
                if (map.containsKey(num + k)) {
                    count++;
                }
            }
        }
        return count;
    }
}
    