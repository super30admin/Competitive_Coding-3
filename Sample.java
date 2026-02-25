// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

public class Sample {
    // Time Complexity : O(numRows^2)
    // Space Complexity : O(1) // since we are returning the result
    // Did this code successfully run on Leetcode : yes
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }

            result.add(row);
        }
        return result;
    }
    // Time Complexity : O(n)
    // Space Complexity : O(n)
    // Did this code successfully run on Leetcode : yes

    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;

        Set<Integer> seen = new HashSet<>();
        Set<Integer> pairs = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num - k)) {
                pairs.add(num - k);
            }
            if (seen.contains(num + k)) {
                pairs.add(num);
            }
            seen.add(num);
        }

        return pairs.size();
    }
}