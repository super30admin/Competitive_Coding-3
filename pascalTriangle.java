// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
import java.util.*;
class pascalTriangle { 
    public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> Result = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> li = new ArrayList<Integer>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    li.add(1);
                } else {
                    int num1 = Result.get(i - 1).get(j - 1);
                    int num2 = Result.get(i - 1).get(j);
                    li.add(num1 + num2);
                }
            }
            Result.add(li);
        }
        return Result;
    }
}