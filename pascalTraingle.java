//118. Pascal's Triangle
//Time Complexity :size of first array is m and size of second array is n. So, O(mn)
//Space Complexity : O(mn) i.e. as no extra space is required to store array elements while processing 
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

//Your code here along with comments explaining your approach

/*output: 
[1]
[1, 1]
[1, 2, 1]
[1, 3, 3, 1]
[1, 4, 6, 4, 1] */


import java.util.*;

public class pascalTraingle {

	 public static List<List<Integer>> generate(int numRows) {
	        if(numRows <= 0 ) return new ArrayList<List<Integer>>();

	        ArrayList<List<Integer>> arr1= new ArrayList<List<Integer>>();
	        

	            for(int i=0;i<numRows; i++){ //i is for index
	                List<Integer> arr2 = new ArrayList<Integer>();
	                for(int j=0; j<=i; j++)
	                {
	                    if(j == 0 || j == i){
	                        arr2.add(1);
	                    }else{
	                        arr2.add(arr1.get(i-1).get(j-1) + arr1.get(i-1).get(j));
	                    }
	                    
	                }
	                arr1.add(arr2);
	            }            
	        return arr1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numRows=5;
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		result=generate(numRows);
		for(List<Integer> i: result) {
			System.out.println(i);
		}

	}

}
