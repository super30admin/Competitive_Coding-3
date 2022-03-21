// Time Complexity : O(n^2)
// Space Complexity : O(n^2)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.ArrayList;
import java.util.List;

// APPROACH:
/* take 2 pointers, start and end, loop till both are less than the length of the array
1. To handle 1 at the front and the last, if (j == i || j = 0) row.add(1)
2. To handle values inside, calculate left - (list(i-1)(j-1)), calculate right - (list(i-1)(j)) , sum both to get the next value - left+right, row.add(left+right)
*/
public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    int start = result.get(i-1).get(j-1);
                    int end = result.get(i-1).get(j);
                    int innerRes = start+end;
                    row.add(innerRes);
                }
            }
            result.add(row);
        }
        return result;
    }

    public static void main(String[] args){
        int numRows1 = 5;
        System.out.println(generate(numRows1)); //[[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

        int numRows2 = 1;
        System.out.println(generate(numRows2)); //[[1]]
    }
}
