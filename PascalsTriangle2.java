// Time Complexity : O(k)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/**
 * used this formula for calculating all elements in kth row. 
 * Any row k, 0th element = 1, formula for each ith element in that row where i > 0, (i-1)th element * (k-(i-1)) / (i)
 */

/**
 * https://leetcode.com/problems/pascals-triangle-ii/
 * 
 * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.

   Note that the row index starts from 0.
   Could you optimize your algorithm to use only O(k) extra space?
   
   
 */
import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {
	 public List<Integer> getRow(int rowIndex) {
	        
	        List<Integer> res = new ArrayList<>();
	        
	        if(rowIndex < 0) return res;
	        
	        res.add(1);
	        
	        if(rowIndex == 0) return res;
	        
	        int b = 1, t = rowIndex;
	        
	        // use long to handle integer overflow
	        long cur = 1;
	        
	        for(int i = 1; i < rowIndex+1; i++) {
	            cur*=t;
	            cur/=b;
	            t--; b++;
	            res.add((int)cur);
	        }
	        return res;
	    }
}
