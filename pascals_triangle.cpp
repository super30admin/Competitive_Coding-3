//Time Complexity - O(n^2)
//Space complexity - O(1)
//Ran successfully on leetcode
/*3 point algo is as follows - 
	1. We realise that each row of values are dependent on the orevious rows values. Hence we can solve this using dynamic programming.
	2. The first and last column of each row is always 1. So we assign that.
	3. Rest of the elements are a sum of the previous two columns in the previous row. So we add them from the previous row of the 2D array.*/

class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>>A(numRows);
        for(int i=0;i<numRows;i++)
        {
            A[i].resize(i+1);
            A[i][0]=1;
            A[i][i]=1;
            for(int j=1;j<i;j++)
                A[i][j]=A[i-1][j]+A[i-1][j-1];
        }
        return A;
    }
};