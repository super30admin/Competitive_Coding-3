// Time Complexity : O(N)
 
// Space Complexity : O(N)

// Did this code successfully run on Leetcode : YES

// Appoarch: Made use of two sets, one set to store the pairs of array values
// another set to store the visited unique elements. 

#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        int n = nums.size();
        set<pair<int,int>> st;
        set<int> visited;
        for(int i=0;i<n;i++){
            int val = nums[i] + k;
            if(visited.find(val)!=visited.end()){
                st.insert({nums[i],val});
            }
            val = nums[i] - k;
            if(visited.find(val)!=visited.end()){
                st.insert({val,nums[i]});
            }
            visited.insert(nums[i]);
        }
        return st.size();

    }
};