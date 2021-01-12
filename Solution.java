//Space Complexity:O(1)
//Time complexity: O(numRows*numRows)
import java.util.*; 

public class Solution {

	public List<List<Integer>> generate(int numRows) {
		 List<List<Integer>> result = new ArrayList<>();
	      if(numRows ==0)return result;
	      List<Integer> first = new ArrayList<>();
	      first.add(1);
	      result.add(first);
	      for(int i=1;i<numRows;i++) {
	    	  List<Integer> prevRow = result.get(i-1);
	    	  List<Integer> newRow = new ArrayList<>();
	    	  newRow.add(1);
	    	  for(int j=1;j<i;j++) {
	    		  newRow.add(prevRow.get(j-1) +prevRow.get(j));
	    	  }newRow.add(1);
	    	  result.add(newRow);
	    	  
	      }return result;
	    }
    public static void main(String [] args)
    {
        System.out.println(new Solution().generate(4));
    }

} 
