// Time Complexity : O(n!) ; n - number of rows
// Space Complexity : O(n!) ; n - number of rows
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
        
    	List<List<Integer>> result = new ArrayList<>();
        
        //edge
        if(numRows == 0)
            return result;
            
        for(int i = 0; i <= numRows-1; i++) {
			List<Integer> rowArray = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
				
				//corner elements are 1
				if(j == 0 || j == i)
                    rowArray.add(1);
                else {
					//[i,j] = [i-1,j-1] + [i-1,j]
                    int left = result.get(i-1).get(j-1);
                    int right = result.get(i-1).get(j);
                    rowArray.add(left + right);
                }    
            }
            result.add(rowArray);
        }
        return result;
	}
}