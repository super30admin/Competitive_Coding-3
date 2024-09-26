// Time Complexity : O(N*N)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

/**
 * 1. for each row find mid index and start calculating from mid and copy calculated values to both sides of mid.
 * 2. it reduces time complexity to n/2 for each row.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PascalTriangle {

	private List<List<Integer>> cal(int rows) {

		List<List<Integer>> result = new ArrayList<>();


		for (int i = 0; i < rows; i++) {
			int[] tmpList = new int[i+1];
			
			tmpList[0]=1;
			
			int leftp=i/2;
			int rightp;
			
			if(i%2==0) {
				 rightp=i/2;				
			}else {
				rightp=i/2+1;
			}
			
			while (leftp>0 && rightp<rows-1) {
				tmpList[leftp]=result.get(i - 1).get(leftp) + result.get(i - 1).get(leftp - 1);
				if(leftp!=rightp)
					tmpList[rightp]=result.get(i - 1).get(rightp) + result.get(i - 1).get(rightp - 1);
				leftp--;
				rightp++;
			}
			if(i>0)
				tmpList[i]=1;
			
			result.add(Arrays.stream(tmpList).boxed().collect(Collectors.toList()));
		}
		
		//brute force
				/*for (int i = 0; i < rows; i++) {
					List<Integer> tmpList = new ArrayList<>(i+1);
					tmpList.add(1);
					for (int j = 1; j < i; j++) {
						tmpList.add(result.get(i - 1).get(j) + result.get(i - 1).get(j - 1));
					}
					if(i>0)
						tmpList.add(1);
					result.add(tmpList);
				}*/

		return result;

	}

	public static void main(String[] args) {
		PascalTriangle sol = new PascalTriangle();

		System.out.println(sol.cal(6));
	}
}
