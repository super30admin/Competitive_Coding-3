// Time Complexity : O(n^2)
// Space Complexity : O(n^2)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach: Create a result ArrayList. Create a new arrayList for every step,
// called curr and prevRow. We add 1 at beginning and ending of curr. In between,
// we fill it with adding prev's j-1 and j values.

// LC- 118. Pascal's Triangle

import java.util.*;

public class PascalsTriangle {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<>();

    if (numRows == 0) {
      return result;
    }

    List<Integer> firstRow = new ArrayList<>();
    firstRow.add(1);
    result.add(firstRow);

    for (int i = 1; i < numRows; i++) {
      List<Integer> prevRow = result.get(i - 1);
      List<Integer> currRow = new ArrayList<>();

      currRow.add(1);
      for (int j = 1; j < i; j++) {
        currRow.add(prevRow.get(j - 1) + prevRow.get(j));
      }
      currRow.add(1);

      result.add(currRow);
    }

    return result;
  }
}
