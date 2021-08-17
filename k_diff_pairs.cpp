// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

// store each element along with its frequencies
// iterate over each pair in the hash_map and find if nums[i] + k exists
// we use addition to find the complement as this helps to prevent adding duplicates
// ex 1+3 =4 ,4 +3 =7
// if k==0 just count the number of elemnts that occur more than once

class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        int count=0;
        unordered_map<int,int>hash_map;
        for(int i : nums){
            hash_map[i]++;
        }
        
        for( auto i : hash_map){
            if(k!=0){
                 if(hash_map.find(i.first + k) != hash_map.end()){
                    count++;
                 }
            }
           
            if(k==0){
                if(i.second > 1){
                    count++;
                }
            }
        }
        return count;
    }
};