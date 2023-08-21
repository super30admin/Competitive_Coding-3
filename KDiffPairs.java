//TC: O(n)
//SC: O(n)
// Did this code successfully run on Leetcode : yes

// Intution is we are creating Hashmap to store the frequency, We need uniquees. 
// Then checking the sum of key and k presen int map.
class KDiffPairs{
    public int findPairs(int[] nums, int k) {
        int result = 0;
        HashMap <Integer,Integer> counter = new HashMap<>();

        for (int n: nums) {
            counter.put(n, counter.getOrDefault(n, 0)+1);
        } // Here we are creating frequency map.

        for (Map.Entry <Integer, Integer> entry: counter.entrySet()) { 
            int x = entry.getKey();
            int val = entry.getValue();
            if (k > 0 && counter.containsKey(x + k)) { 
                result++;
            } else if (k == 0 && val > 1) { // if array contains same element.
                result++;
            }
        }
        return result;
    }
}