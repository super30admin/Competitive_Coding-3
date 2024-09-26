// Time Complexity :O(numRows^2)
// Space Complexity :O(numRows^2)
// Did this code successfully run on Leetcode :Yes


// Your code here along with comments explaining your approach
import java.util.*;
import java.io.*;

public class Problem_2 {
	public static void main(String[] args) {
		int numRows= 7;
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list =generateTriangle(numRows);
		list.forEach(System.out:: println);
		
	}
	public static List<List<Integer>> generateTriangle(int numRows){
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		if(numRows==0) return triangle;
		
		//Base condition first row is always 1
		triangle.add(new ArrayList<Integer>());
		triangle.get(0).add(1);
		//Calculate the values for each row until numRows value is reached
		for(int line=1; line<numRows; line++) {
			//Declare new List for each row
			List<Integer> rows= new ArrayList<Integer>();
			List<Integer> prevRows = triangle.get(line-1);
			//First element of list is always 1
			rows.add(1);
			//Every row will have values equal to the value of line, hence iterate only until line value
			for(int j=1; j<line; j++) {
				rows.add(prevRows.get(j-1)+prevRows.get(j));	
			}
			//Last element of array is always 1
			rows.add(1);
			//Finally add the rows in the triangle
			triangle.add(rows);
		}
		return triangle;
		
	}
	

}
