118. Pascal's Triangle

Time Complexity : O(N^2). Where N is the numRows. Here total number of iterations are : N*(N+1)/2 which creates the time complexity.

Space Complexity : O(1). Constant space. Because we are creating 2D vector output as per the demand of program

#include<cmath>

class Solution {
public:
 
    /*
    vector<vector<int>> generate(int n) {
        if(n==0)
            return {};
        
        vector<vector<int>> matrix(nums);

       
        matrix.push_back({1});
        
        for(int i=1;i<n;i++){
            for(int j=0;j<=i;j++){
                
                // first & last positions are always 1.
                if(j==0||j==i) 
                    matrix[i][j] = 1;
                
                // other positions are some of above two positions.
                else if(j>0)
                    matrix[i][j] =  matrix[i][j-1] + (matrix[i-1][j-1] ? matrix[i-1][j-1] : 0);
                
            }

        }
        return matrix;
    }
    
    */
    
    vector<vector<int>> generate(int nums) {
        vector<vector<int>>triangle(nums);
        
        for(int i = 0; i < nums; i++)
        {
		    // Row is resized to i+1 because at every row elements are one more than index .
            triangle[i].resize(i+1);
            for(int j = 0; j <= i ; j++)
            {
			   // in case of first column or in case of same row column there is simply 1 .
                if(j == 0 || i == j)
                    triangle[i][j] = 1;
                else
				    //  otherwise , at any index , value is equal to sum of values of indexes directly above it.
                    triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
            }
        }
        return triangle;
    }
    
    
    
};
