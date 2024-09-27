// TC : O(k^2) where n represents the numbers in the kth array and we need to traverse the previous array to calculate the current array
// SC : O(k) since we are using resultant array to store result.

// We will get store the previous row values at that particular indices and while calculating the current values, we are adding the values of the previous row.
// We repeat this process till we reach the kth row. We know that the resultant array/Pascals triangle contains 1 at the start and 1 at the end, So we are
// adding the 1 to the list at start and end.

import java.util.*;

public class PascalsTriangle {

	public List<Integer> pascalTriangle(int k){
//		
//		List<List<Integer>> res = new ArrayList();
//		res.add(new ArrayList());
//		res.get(0).add(1);
//		for(int r =1;r<=k;r++) {
//		
//
//				List<Integer> row = new ArrayList();
//				List<Integer> prevRow = res.get(r-1);
//				
//				row.add(1);
//				
//				for(int i=1;i<r;i++) {
//					row.add(prevRow.get(i)+ prevRow.get(i-1));
//				}
//				
//				row.add(1);
//				res.add(row);
//			
//		}
//		
//		return res.get(k);
		
		
		List<Integer> res = new ArrayList();
		res.add(1);
		
		for(int i=1;i<=k;i++) {
			for(int j=i-1;j>=1;j--) {
				
				res.set(j,  res.get(j-1)+res.get(j));
			}
			res.add(1);

		}
		return res;
	}
	public static void main(String[] args) {
		
		PascalsTriangle pt = new PascalsTriangle();
		List<Integer> res = pt.pascalTriangle(4);
		
		for(int l: res) {
			System.out.println(l);
		}
		
	}
	
}

