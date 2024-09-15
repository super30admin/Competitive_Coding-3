// Time Complexity : O(n^2) where n is the number of rows to be generated
// Space Complexity : O(n^2)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pt = new ArrayList<List<Integer>>();
        
        if(numRows == 0) return pt;
        
        pt.add(new ArrayList<>());
        pt.get(0).add(1);
        
        for(int row = 1; row < numRows; row++){
            List<Integer> prevRow = pt.get(row - 1);
            List<Integer> currRow = new ArrayList<>();
            
            currRow.add(1);
            
            for(int i = 1; i < row; i++){
                currRow.add(prevRow.get(i-1) + prevRow.get(i));
            }
            
            currRow.add(1);
            pt.add(currRow);
            
        }
        return pt;
    }
	
	public static void main(String[] args) {
		int numRows = 5;
		System.out.println(PascalsTriangle.generate(numRows));
	}
	
}
