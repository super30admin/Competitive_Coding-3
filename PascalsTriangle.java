package s30Coding;

import java.util.*;

//Time Complexity :- O(n^2) we iterate each row twice to get the next row.

//Space Complexity :- O(n) where n is the number of rows

//Leet Code :- Yes

public class PascalsTriangle {
	 public List<List<Integer>> generate(int numRows) {
	        if(numRows == 0){
	            return new ArrayList<List<Integer>>();
	        }
	        
	        List<List<Integer>> result = new ArrayList<>();
	        result.add(new ArrayList<Integer>());
	        result.get(0).add(1);
	        
	        while(result.size() < numRows){           
	            List<Integer> listTemp = new ArrayList<>();
	            listTemp.add(1);
	            for(int i = 1; i < result.size() + 1; i++){
	                if(i ==  result.size()){
	                    listTemp.add(1);
	                }
	                else if(i-1 >= 0){
	                    int x = result.get(result.size() - 1).get(i);
	                    int y = result.get(result.size() - 1).get(i-1);
	                    listTemp.add(x + y);
	                }
	            }
	            result.add(listTemp);
	        }
	        return result;
	    }
}
