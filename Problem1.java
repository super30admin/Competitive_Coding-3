package Competitive;

import java.util.*;

//Time: O(n)
//Space : O(1) except for output list
public class Problem1 {
	 public List<List<Integer>> generate(int numRows) {
	        if(numRows==0)
	            return new ArrayList<>();
	    
	        List<List<Integer>> lists = new ArrayList<List<Integer>>();
	        lists.add(new ArrayList<Integer>()); 
	        lists.get(0).add(1);
	        for(int i=1;i<numRows;i++){
	              List<Integer> nums= new ArrayList<Integer>();
	            for(int j=0;j<=i;j++){
	                
	                if(j==0 || j==i){
	                    
	                    nums.add(1);
	                }else{
	                      
	                    nums.add(lists.get(i-1).get(j-1)+lists.get(i-1).get(j));
	                }
	            }
	            lists.add(nums);
	        }
	        return lists;
	        
	        }
}
