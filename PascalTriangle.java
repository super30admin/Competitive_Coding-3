// Time Complexity : O(N^2)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	 public List<List<Integer>> generate(int numRows) {
	        List<List<Integer>> result=new ArrayList<>();
	        int i=0;
	        while(i<numRows){
	            List<Integer> curr=new ArrayList<>();
	            if(i==0){
	               curr.add(1);   
	            }else{
	                List<Integer> temp=result.get(i-1);
	                curr.add(1);
	                for(int j=0;j<temp.size()-1;j++){
	                    curr.add(temp.get(j)+temp.get(j+1));
	                }
	                curr.add(1);
	            }
	              result.add(curr);
	            i++;
	        }
	        return result;
	 }
}
