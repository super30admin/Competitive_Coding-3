// Time Complexity : O(k).  k is the number of rows.
// Space Complexity : O(k). k is the number of elements. 
// Did this code successfully run on Leetcode :

// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//If k is an input,return only kth row in array as output

public class PascalTriangleKSpace {

	public static void main(String[] args) {
		

		PascalTriangleKSpace pascalTriangleKSpace = 
				new PascalTriangleKSpace();
		pascalTriangleKSpace.generate(6);

	}

	public int[] generate(int numRows) {
		int value=1;
		int[] kRow = new int[numRows];
		for(int i=1;i<=numRows;i++) {
			kRow[i-1]=value;
			value=value*(numRows-i)/i;
		}
		return kRow;
	}
}
