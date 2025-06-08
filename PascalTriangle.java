/*
Time Complexity : O(numRows^2) where numRows is the number of rows in Pascal's Triangle.
Space Complexity : O(numRows^2) for storing the triangle in a list of lists.
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Intuition: I used a nested loop to build each row of Pascal's Triangle.
*/

import java.util.*;

class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1); // First and last elements are always 1
                } else {
                    int val = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                    row.add(val);
                }
            }

            triangle.add(row);
        }

        return triangle;
    }
}
