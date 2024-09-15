// Time Complexity :O(n) where n in the number elements in the vector
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        unordered_map<int, int> hMap;
        set<pair<int,int>> ansSet;
        for(int i = 0;i < nums.size(); i++){
            if(hMap.find(nums[i]) != hMap.end() && k == 0)
                ansSet.insert({nums[i],nums[i]});
            else
                hMap[nums[i]] = i;
        }
        int temp1,temp2;
        for(int i = 0; i< nums.size(); i++){
            temp1 = nums[i]-k;
            if(hMap.find(temp1) != hMap.end() && nums[i] != temp1){
                if(ansSet.find({temp1,nums[i]}) == ansSet.end())
                    ansSet.insert({nums[i],temp1});
            }
            temp2 = nums[i]+k;
            if(hMap.find(temp2) != hMap.end() && nums[i] != temp2){
                if(ansSet.find({temp2,nums[i]}) == ansSet.end())
                    ansSet.insert({nums[i],temp2});
            }
        }
        for(auto ans:ansSet){
            cout<<ans.first<<" "<<ans.second<<endl;
        }
        return ansSet.size();
    }   
};