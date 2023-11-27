/*Initialize an empty two-dimensional vector ret to store Pascal's Triangle.
Iterate through each row up to the given numRows. For each row, create a vector row with i + 1 elements, initialized to 1.
Update the internal elements of the row vector using values from the previous row to build Pascal's Triangle. Add the completed row to the result vector ret.
Time Complexity: O(numRows^2) - Each row requires processing and updating values, and there are numRows rows.

Space Complexity: O(numRows^2) - The space required to store Pascal's Triangle up to numRows rows*/
#include<bits/stdc++.h>
class Solution {
public:
    vector<vector<int>> generate(int numRows) {
    vector<vector<int>> ret;
	for (int i = 0; i < numRows; i++) {
		vector<int> row(i + 1, 1);
		for (int j = 1; j < i; j++) {
			row[j] = ret[i - 1][j] + ret[i - 1][j - 1];
		}
		ret.push_back(row);
	}
	return ret;
    }
};