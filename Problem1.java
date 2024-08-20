//Time = O(n)
//Space = O(n)

class Solution {
    public int findPairs(int[] nums, int k) {
        // Edge case: If k is negative, no pairs can have a negative difference.
        if (k < 0) return 0;
        
        // HashMap to store the frequency of each number in the array.
        Map<Integer, Integer> countMap = new HashMap<>();
        
        // Populate the HashMap with the count of each number.
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        int pairCount = 0;
        
        // Iterate through the HashMap to find valid pairs.
        for (int num : countMap.keySet()) {
            // If k is 0, we are looking for numbers that appear more than once.
            if (k == 0) {
                if (countMap.get(num) > 1) {
                    pairCount++;
                }
            } else {
                // Check if there is a number num + k in the map.
                if (countMap.containsKey(num + k)) {
                    pairCount++;
                }
            }
        }
        
        return pairCount;
    }
}