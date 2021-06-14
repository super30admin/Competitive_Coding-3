package CompetitiveCoding3;

import java.util.ArrayList;
import java.util.List;

//Time Complexity : O(n^2) since we are using 2 iterations
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

//Your code here along with comments explaining your approach



public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		List<List<Integer>> res = new ArrayList<>();
		
		res = buildPascalTriangle(n);
		
		System.out.println(res);
		
	}

	private static List<List<Integer>> buildPascalTriangle(int n) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> res = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			List<Integer> eachRow = new ArrayList<>();
			for(int j=0; j<=i; j++) {
				if(j ==0 || j==i) eachRow.add(1);// put 1's at the beginning at end
				else {//calculate the other numbers based on previous row elems
					int num1 = res.get(i-1).get(j-1);
					int num2 = res.get(i-1).get(j);
					eachRow.add(num1+num2);					
				}

			}
			res.add(eachRow);
		}
		
		return res;
	}

}
