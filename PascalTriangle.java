//Time Complexity - O(n2) where n is the number of rows
//Space Complexity - O(n)
//Did it run successfully on Leetcode - Yes

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        // If row count is zero, return empty list.
        if (numRows == 0) {
            return result;
        }

        // The top of the triangle will always be 1. Hence pre-added.
        List<Integer> first = new ArrayList<>();
        first.add(1);
        result.add(first);

        // Build the Pascal Triangle from the second row.
        for (int i = 1; i < numRows; i++) {
            List<Integer> prev = result.get(i - 1);
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int j = 1; j < i; j++) {
                int sum = prev.get(j) + prev.get(j - 1);
                row.add(sum);
            }

            row.add(1);
            result.add(row);
        }

        return result;
    }
}