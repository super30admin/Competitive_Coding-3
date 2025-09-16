// Problem - Pascal Triangle
//  Time Complexity : O(n^2)
//  Space Complexity : O(1)
//  Did this code successfully run on Leetcode : Yes
//  Any problem you faced while coding this : No

// Explaination
// 1. We initialize the result 2d array with 1 element our base condition
// 2. We go through each row and if we have our at first or last element we just
// add 1
// 3. Otherwise we add previous_row above_col value and previous_row above_col -
// 1 value

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
  vector<vector<int>> generate(int numRows) {
    vector<vector<int>> res = {{1}};
    if (numRows == 1)
      return res;
    for (int i = 1; i < numRows; i++) {
      vector<int> temp;
      for (int j = 0; j <= i; j++) {
        // base cond
        if (j == 0 || j == i) {
          temp.push_back(1);
        } else {
          // logic
          temp.push_back(res[i - 1][j] + res[i - 1][j - 1]);
        }
      }
      res.push_back(temp);
    }

    return res;
  }
};
