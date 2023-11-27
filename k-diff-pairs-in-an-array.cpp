/*Create an unordered_map mp to store the frequency of each number in the array.
Iterate through the map, and for each entry, check if there exists another number (either num + k or the same number if k is 0) in the map. If so, increment the count.
Return the final count as the result.
Time Complexity: O(n) - The algorithm iterates through the array and the unordered_map once.

Space Complexity: O(n) - The unordered_map stores the frequency of each unique element in the array.*/
#include<bits/stdc++.h>
class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        int n=nums.size();
        int count=0;
        unordered_map<int,int>mp;
        for(int i=0;i<n;i++){
            mp[nums[i]]++;
        }
       for (auto& entry : mp) {
            int num = entry.first;
            int freq = entry.second;
            if ((k > 0 && mp.count(num + k)) || (k == 0 && freq > 1)) {
                count++;
            }

        }
        return count;
    }
};