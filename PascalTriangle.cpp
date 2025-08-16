#include<iostream>
#include<bits/stdc++.h>
#include<vector>
using namespace std;
/*
Start with the first row of Pascal’s triangle as [1]
For each new row, build it using the sum of adjacent elements from the previous row.
Add 1 at the start and end of every new row, and repeat until the desired number of rows
*/
class Solution{
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> result;
        result.push_back({1});
        for(int i=1;i<numRows;i++){
            vector<int> prevRow = result[i-1];
            vector<int> currRow;
            currRow.push_back(1);
            for(int j=1;j<prevRow.size();j++){
                currRow.push_back(prevRow[j-1] + prevRow[j]);
            }
            currRow.push_back(1);
            result.push_back(currRow);
        }
        return result;
    }
};
