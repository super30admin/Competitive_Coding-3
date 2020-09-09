/* S30 Big N Problem #42 {Medium}
119. Pascal's Triangle II - EASY
https://leetcode.com/problems/pascals-triangle-ii/

Did this code successfully run on Leetcode : yes
Any problem you faced while coding this : yes
*/

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Pascal {
    
    /*
    Time Complexity : O(n^2) => n - rowIndex
    Space Complexity : O(n^2) => 2D matrix of size rowIndex * rowIndex to save all values
    Approach : Every value in the traingle is a sum of 2 values in the previous row
    The first and last element of each row is 1.
    */
    public static List<Integer> getRow1(int rowIndex) {
        Integer[][] res = new Integer[rowIndex+1][rowIndex+1];
        
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                if (i == 0 || j == 0 || j == i) {
                    res[i][j] = 1;
                } else {
                    res[i][j] = res[i-1][j-1] + res[i-1][j];
                }
            }
        }
        
        return Arrays.asList(res[rowIndex]);
    }
    
    /*
    Time Complexity : O(n^2) => n - rowIndex
    Space Complexity : O(n) => n - rowIndex
    Approach: From the previous approach, we observe that, every row only needs information 
    from the immediate previous row. This information can be stored in a 1D array of size rowIndex.
    */
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        
        for (int i = 1; i <= rowIndex; i++) {
            // start from end
            // if we start from the beginning, we will overwrite the values
            // needed for computing the (j+1)th computation
            for (int j = i; j > 0; j--) {
                if (j == i) {
                    result.add(1);
                } else {
                    result.set(j, result.get(j) + result.get(j-1));    
                }                
            }
        }
        
        return result;
    }

    public static void main(String args[]) {
        System.out.println(getRow(5));
        System.out.println(getRow1(4));
    }
}