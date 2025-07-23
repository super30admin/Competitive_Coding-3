//ime Complexity (TC):O(n) — One pass to build the frequency map: O(n). one pass over map keys: O(n) (in worst case, all unique)
//Space Complexity (SC):O(n) — For storing up to n unique elements in the HashMap.

//Count the frequency of each number using a HashMap.
//Iterate over the keys and check:
//If k == 0, count keys with frequency ≥ 2.
//If k > 0, check if (key - k) exists in the map.
//Increment the pair count accordingly.

class Solution {
    public int findKDiffPairs(int[] numbers, int difference) {
      
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int pairCount = 0;

        // Count the frequency of each number
        for (int number : numbers) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        // Check for valid pairs
        for (int currentNumber : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(currentNumber);
            if (difference == 0) {
                if (frequency >= 2) {
                    pairCount++;
                } 
            } else {
                if (frequencyMap.containsKey(currentNumber - difference)) {
                    pairCount++;
                }
            }
        }

        return pairCount;
    }
}
