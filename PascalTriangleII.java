// TC: O(2^n)
// SC: O(n)
// Approach: Each element i is equal to the sum of two elements directly above it (i-1 and i)
// with the base condition that the first and last element of any row will be equal to 1

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {

  public List<Integer> nthRowOfPascalTriangle(int n) {
    ArrayList<Integer> result = new ArrayList<>();

    for (int i = 0; i <= n; i++) {
      int val = findVal(i, n);
      result.add(val);
    }
    return result;
  }

  // funtion recursively finds the ith value of nth row
  private int findVal(int i, int n) {
    if (i == 0 || i == n) {
      return 1;
    }
    return findVal(i - 1, n - 1) + findVal(i, n - 1);
  }

  public static void main(String[] args) {
    PascalTriangleII pt = new PascalTriangleII();
    int n = 3;
    System.out.println(pt.nthRowOfPascalTriangle(n));
  }
}