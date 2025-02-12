// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

//Approach: 
// 1. Create a map to store the frequency of each element in the array.
// 2. If k is 0, then check if the frequency of the element is greater than or equal to 2, then increment the count.
// 3. If k is not 0, then iterate through the array and check if key + k is in map and increment count
// 4. Return count

class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        int count = 0; 
        unordered_map<int, int> map; 
        for(int i : nums){
            if(map.find(i) == map.end()){
                map[i]++;
            }
            else{
                map[i]++;
            }
        }
        if(k == 0){
            for(pair <int,int> it: map){
                if(it.second >= 2){
                    count++;
                }
            }
        }else{
            for(int i = 0; i < nums.size(); i++){
                if(map.find(nums[i] + k) == map.end()){
                    continue;
                }
                else{
                    count++;
                    map[nums[i]]--;
                    map[nums[i+k]]--;
                }
            }
        }
        return count;
    }
};