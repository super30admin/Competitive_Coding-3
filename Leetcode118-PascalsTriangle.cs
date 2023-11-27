//Leetcode 118 - Pascal's Triangle
//TC: O(n^2)
//sc: O(n^2)

// Time complexity:
// The time complexity is O(numRows^2) because, for each row, we iterate through each element in that row, and we do this for each row up to numRows.

// Space complexity:
// The space complexity is O(numRows^2) because we use a 2D list (result) to store the entire Pascal's Triangle. The space required grows quadratically with the input (numRows).

public class Solution {
	public IList<IList<int>> Generate(int numRows) {
		
		List<IList<int>> result = new List<IList<int>>();
		
		//base case
		if(numRows < 0 ) return result;
		
		List<int> output = new List<int>();
		output.Add(1);
		result.Add(output);
		
		for(int i=1; i< numRows; i++)
		{
			List<int> temp = new List<int>();
			
			for(int j=0; j<=i; j++)
			{
				//corner cases to put 1
				if(j == 0 || j== i) temp.Add(1);
				else
					temp.Add(output[j-1]+ output[j]);
			}
			output = temp;
			result.Add(output);
		}
		return result;
	}
}
