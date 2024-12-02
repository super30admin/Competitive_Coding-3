// Time Complexity is O(N^2) let me know if it is correct
// Space Complexity is O(1) as we are outputing the array that we are creating
// This solution is submitted on leetcode

public class BigN42PascalsTriangleSolution {
	
	    public List<List<Integer>> generate(int numRows) {
	        List<List<Integer>> result = new ArrayList<>();
	        // edge case
	        if (numRows==0)
	            return result;
	        for(int i =0;i< numRows;i++){
	            List<Integer> row = new ArrayList<>();
	            for(int j = 0;j<=i;j++){
	                if(j == 0 || j==i){ 
	                    row.add(1);
	                }
	                else{
	                    int left = result.get(i-1).get(j-1);
	                    int right = result.get(i-1).get(j);
	                    row.add(left+right);
	                }  
	            }
	            result.add(row);
	        }
	        return result;
	    }
	}