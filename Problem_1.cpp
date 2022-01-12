/*
Time complexity:
O(n^2)
*/

/*
Space Complexity:
O(n^2)
*/

/* 
Approach:
The intution behind this solution is that the next row is the sum of the
previous row's elements. And as it is clear from the description, that the
outer cells have 1 always. So we created the resultant vector with all 1s
and updated the required cells according to the algorithm
*/


class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> output; //resultant vector
        for(int i = 0; i< numRows; i++){
            vector<int> r(i+1,1); //number of elements in each row, based on the number of row
            for(int j = 1; j< i; j++){
                {
                    r[j] = output[i-1][j-1] + output[i-1][j]; 
                    
                }
            }
            output.push_back(r); // pushing each row in the resultant vector
        }
        
        return output;
        
    }
};