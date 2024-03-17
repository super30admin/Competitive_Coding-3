// Time Complexity : O(n) 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

/*
Leetcode : https://leetcode.com/problems/pascals-triangle/description/

Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
*/


class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<int>prev{1};
        vector<vector<int>>result{prev};

        while(numRows > 1){
            vector<int>current{1};
            for(int i=0; i<prev.size()-1; i++){
                current.push_back(prev[i] + prev[i+1]);
            }
            current.push_back(1);
            result.push_back(current);
            prev = current;
            numRows--;
        }

        return result;
    }
};