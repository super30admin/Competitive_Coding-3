// Problem - K-diff pairs in an Array
//  Time Complexity : O(n)
//  Space Complexity : O(1)
//  Did this code successfully run on Leetcode : Yes
//  Any problem you faced while coding this : No

// Explaination
// 1. We first sort the array so that we can use two pinters to navigate
// 2. We treat like a two sum problem skip duplicates and not using the same
// index, and make the pointer forward based on current value < k or > k
// 3. In the end we return the count

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
  int findPairs(vector<int> &nums, int k) {
    sort(nums.begin(), nums.end());
    int n = (int)nums.size();
    int count = 0;
    int i = 0;
    int j = 0;

    while (i < n && j < n) {
      if (i == j || nums[j] - nums[i] < k)
        j++;
      else if (nums[j] - nums[i] > k)
        i++;
      else {
        i++;
        j++;
        count++;
        while (i < n && nums[i] == nums[i - 1])
          i++;
      }
    }

    return count;
  }
};
