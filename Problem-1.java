
// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : a little near creating hashset logic


// Your code here along with comments explaining your approach
// Use a HashSet (prev_visited_elem) to track numbers seen so far so you can instantly check if a matching pair exists.
// For each number, compute x = num - k and y = num + k and check if either value was seen before — if yes, that forms a valid k-diff pair.
// Store each pair in a set (output) to avoid duplicates, and return the number of unique pairs found.

class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;

        HashSet<Integer> prev_visited_elem = new HashSet<>();
        HashSet<String> output = new HashSet<>();

        for (int num : nums) {
            int x = num - k;
            int y = num + k;

            if (prev_visited_elem.contains(x)) {
                // store pair in normalized order (smaller first)
                int a = x;
                int b = num;
                output.add(a + "," + b);
            }

            if (prev_visited_elem.contains(y)) {
                int a = num;
                int b = y;
                output.add(a + "," + b);
            }

            prev_visited_elem.add(num);
        }

        return output.size();
    }
}
