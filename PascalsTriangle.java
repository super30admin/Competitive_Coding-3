// Time Complexity :O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
/*
 *Used Nested Loops, OuterLoop starts from i = 1 and controls the number of rows
 *Inner loop controls the element insertion in each row starts from 0 till (i - 1)
 * For inner loop if its first or last element insert One (last element w.r.t j = i-1 OR j = 0)
 * Else insert element as sum of elements from (current row - 2 rows) and postiton in jth and jth-1 elements 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        // return helperRecursion(numRows);

        // Map<Integer, List<List<Integer>>> hmap = new HashMap<>();
        // return helperMemoization(numRows, hmap);

        return helperTabulation(numRows);
    }

    private List<List<Integer>> helperTabulation(int n) {
        List<List<Integer>> dp = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    row.add(1);
                } else {
                    int element = dp.get(i - 2).get(j) + dp.get(i - 2).get(j - 1);
                    row.add(element);
                }
            }
            dp.add(row);
        }

        return dp;
    }

    // private List<List<Integer>> helperMemoization(int n, Map<Integer, List<List<Integer>>> hmap) {

    //     if (n == 1) {
    //         List<List<Integer>> result = new ArrayList<>();
    //         List<Integer> firstRow = new ArrayList<>();
    //         firstRow.add(1);
    //         result.add(firstRow);
    //         return result;
    //     }

    //     if (hmap.containsKey(n)) {
    //         return hmap.get(n);
    //     }

    //     // previous rows
    //     List<List<Integer>> prevRows = helperMemoization(n - 1, hmap);

    //     List<Integer> newRow = new ArrayList<>();
    //     for (int i = 0; i < n; i++) {
    //         newRow.add(1);
    //     }

    //     for (int i = 1; i < n - 1; i++) {
    //         int value = prevRows.get(n - 2).get(i - 1) + prevRows.get(n - 2).get(i);
    //         newRow.set(i, value);
    //     }

    //     prevRows.add(newRow);

    //     hmap.put(n, prevRows);

    //     return hmap.get(n);
    // }

    // private List<List<Integer>> helperRecursion(int n) {

    //     if (n == 1) {
    //         List<List<Integer>> result = new ArrayList<>();
    //         List<Integer> firstRow = new ArrayList<>();
    //         firstRow.add(1);
    //         result.add(firstRow);
    //         return result;
    //     }

    //     // previous rows
    //     List<List<Integer>> prevRows = helperRecursion(n - 1);

    //     List<Integer> newRow = new ArrayList<>();
    //     for (int i = 0; i < n; i++) {
    //         newRow.add(1);
    //     }

    //     for (int i = 1; i < n - 1; i++) {
    //         int value = prevRows.get(n - 2).get(i - 1) + prevRows.get(n - 2).get(i);
    //         newRow.set(i, value);
    //     }

    //     prevRows.add(newRow);

    //     return prevRows;
    // }
}