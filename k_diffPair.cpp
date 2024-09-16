/*

// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
Edge case where the k==0 


// Your code here along with comments explaining your approach
Create a hash map to count the frequency of each element. we should know for unique pair (3,5)
and (5,3) are same therefore we can consider only on difference along the positive side or the negative side.
So taking the positive side we check if for a given number if number + k had exist then we will consider that as a pair.
*/

#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        int result{};
        unordered_map <int,int> count;
        for(auto &i:nums){
            count[i]++;
        }
        for(const auto& pair : count){
            if((k==0 && pair.second>1)||(k!=0 && count.count(pair.first+k)))
                result++;
        }
        return result;
    }
};


/*

Two pointer with edge case

class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        int count{0};
        int n = nums.size();
        if(n == 1) return 0;
        sort(nums.begin(),nums.end());
        for(auto &i:nums) cout<<i<<" ";
        int l{0};
        int r{1};
        cout<<endl;
        while(r<n){
            if(nums.at(r) - nums.at(l) == k){
                ++l;
                ++r;
                count++;
            }
            else if((nums.at(r)-nums.at(l))>k){
                ++l;
            }
            else if((nums.at(r)-nums.at(l))<k){
                ++r;
            }
        }
        return count;
    }
};

*/

/*

Solution with few edge cases


class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        if(k==0){
            const int size_k = 10000000;
            vector<bool> hash_set (2*size_k,false);
            int count{};
            for(auto &i:nums){
                if(hash_set[i+size_k]){
                    hash_set[i+size_k] = false;
                    count++;
                }
                else{
                    hash_set[i+size_k] = true;
                }
            }
            return count;
        }
        const int size_k = 100000000;
        vector<bool> hash_set (2*size_k,false);
        int count{};
        for(auto &i:nums){
            hash_set[i+size_k] = true;
        }
        for(auto &i:nums){
            if(i-k>=0 && hash_set[i-k+size_k]) ++count;
            if(i+k<= INT_MAX && hash_set[i+k+size_k]) ++count;
            hash_set[i+size_k] = false;
        }
        return count;
    }
};

*/