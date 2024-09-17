// Time Complexity : O(N) Where N is the length of input array
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class FindKPairs {
    public int findPairs(int[] nums, int k) {

        int result = 0;

        HashMap <Integer,Integer> counter = new HashMap<>();

        // count no of occurances of each element in array, so that gets counted once
        for (int n: nums) {
            counter.put(n, counter.getOrDefault(n, 0)+1);
        }

        // iterate over hashmap
        for (Map.Entry <Integer, Integer> entry: counter.entrySet()) {
            int x = entry.getKey();
            int val = entry.getValue();

            // check if it contains key for the remaining value
            if (k > 0 && counter.containsKey(x + k)) {
                result++;
            } else if (k == 0 && val > 1) {
                result++;
            }
        }
        return result;

    }
}