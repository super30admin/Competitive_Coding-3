/**** Method 1 ****/
//Time Complexity: O(n^2)
//Space Complexity: O(n^2)

//Successfully submitted in LeetCode

//Take two loops, start with traversing the arrays, if at the start or end insert 1 or insert sum of both j and j-1 from i-1 index of ans list. At the end return ans.

import java.util.ArrayList;
import java.util.List;

public class _118_Pascal_Triangle {

  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> res = new ArrayList<>();

    for (int i = 0; i < numRows; i++) {
      List<Integer> list = new ArrayList<>();
      for (int j = 0; j < i + 1; j++) {
        if (j == 0 || j == i) {
          list.add(1);
        } else {
          list.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
        }
      }
      res.add(list);
    }
    return res;
  }
}
