// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

#include <iostream>
#include <vector>
#include <unordered_map>
  
using namespace std;

//add value in hashmap and add value as count
class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        unordered_map<int, int> occurence;
        int count = 0;

        for(int i = 0; i < nums.size(); i++){
            if(occurence.find(nums[i]) != occurence.end()){
                occurence[nums[i]]++;
            }
            else{
                occurence[nums[i]] = 1;
            }
        }

        for(auto it : occurence){
            if (k == 0) {
                if (it.second >= 2) {
                    count++;
                }
            } 
            else {
                if (occurence.count(it.first - k) > 0) {
                    count++;
                }
            }
        }
        return count;
    }
};