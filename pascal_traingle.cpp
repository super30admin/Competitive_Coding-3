/*

// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
The iteration number.

// Your code here along with comments explaining your approach
Every row will have index+1 number of elements. 
Each element that lies between the first and the last element  = the sum of the previous element and current element
in the previous row.

*/

#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> sol;
        for(int i{};i<numRows;++i){
            vector<int> arr(i+1,1);
            for(int j{1};j<i;++j){
                arr.at(j) = sol.at(i-1).at(j-1)+sol.at(i-1).at(j);
            }
            sol.push_back(arr);
        }
        return sol;
    }
};