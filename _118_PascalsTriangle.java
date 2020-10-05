package com.javadwarf.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _118_PascalsTriangle {

	public static void main(String[] args) {
		System.out.println(new _118_PascalsTriangle().generate(5));

	}

	// time and Space o(n^2)
	public List<List<Integer>> generate(int numRows) {
		
		List<List<Integer>> res = new ArrayList<>();
		
		int k = numRows-1;
		
		for(int i=0; i<numRows; i++,k--) {
			
			List<Integer> temp = new ArrayList<Integer>();
			
			for(int j=k; j<numRows; j++) {
				
				if(j==k || j==numRows-1) {
					temp.add(1);
				}
				else {
					int sum = res.get(i-1).get(numRows-j-1) + res.get(i-1).get(numRows-j-2);
					temp.add(sum);
				}
			}
			
			res.add(temp);
		}
		
		return res;
		

	}

}
