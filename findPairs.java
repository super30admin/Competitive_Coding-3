// Time Complexity : O(n)
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach
public class Solution {
    public int findPairs(int[] nums, int k) {

        int result = 0;

        // store all elements in hashmap 
        HashMap <Integer,Integer> counter = new HashMap<>();
        for (int n: nums) {
            counter.put(n, counter.getOrDefault(n, 0)+1);
        }

        // hashmap keys will be unique now and we can go through them to find our result
        // by checking if diff exists in map or not
        for (Map.Entry <Integer, Integer> entry: counter.entrySet()) {
            int x = entry.getKey();
            int val = entry.getValue();
            if (k > 0 && counter.containsKey(x + k)) {
                result++;
            } else if (k == 0 && val > 1) {
                result++;
            }
        }
        return result;
    }
}
