// https://leetcode.com/problems/k-diff-pairs-in-an-array/description/
// Time Complexity : O(n) where n is the length of the input array
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Declare a map to store the frequency of each element.
// If k = 0, then any element that appears more than once, is one pair with k=0. G
// Else, for each element, calculate the sum of that element and k, check for the summation in the map. If found increment count.


class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        int n = nums.size();
        unordered_map<int, int> mp;
        int count=0;
        for(auto num:nums){
            mp[num]++;
        }
        if(k==0){
            for(auto it:mp){
                if(it.second > 1) count++;
            }
        }
        else{
            for(auto it:mp){
                if(mp.find(it.first + k) != mp.end()) count++;
            }
        }
        return count;
    }
};
