// Time Complexity : O(N) N is length of Nums
// Space Complexity : O(N') N' is number of unique elements in nums
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : dealing with repeat pairs for duplicate elements


// Your code here along with comments explaining your approach: frequency map, and iterating over freq map to avoid duplicate elements

public class KDiff {
    public int findPairs(int[] nums, int k) {

        int result = 0;

        HashMap <Integer,Integer> freqMap = new HashMap<>();
        for (int n: nums) {
            freqMap.put(n, freqMap.getOrDefault(n, 0)+1);
        }


        for (Map.Entry <Integer, Integer> entry: freqMap.entrySet()) {
            int n = entry.getKey();
            int freq = entry.getValue();
            if (k > 0 && freqMap.containsKey(n + k)) {
                result++;
            } else if (k == 0 && freq > 1) {
                result++;
            }
        }
        return result;
    }
}
