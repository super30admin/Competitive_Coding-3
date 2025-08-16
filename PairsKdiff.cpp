#include<iostream>
#include<bits/stdc++.h>
#include<vector>
using namespace std;
/*
Using a hashmap to store the frequency of each number and then
if k is 0 we increment the count and if the element  plus k is in the map increment
the count and then finaally return count
*/
class Solution{
public:
    //TC : O(n) SC: O(n)
    int pairsDifference(vector<int>& nums, int k){
        unordered_map<int, int> map;
        int count=0;
        for(int num : nums){
            map[num]++;
        }

        for(auto x : map){
            if(k==0){
                if(x.second>1) count++;
            }else if(map.count(x.first + k)){
                count++;
            }
        }
        return count;
    }
};
