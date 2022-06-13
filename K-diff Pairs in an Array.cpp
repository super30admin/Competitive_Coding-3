//Time Complexity- O(n)
//Space Complexity- O(n)

class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        
        if(nums.size()==0){
            return 0;
        }
        
        int count=0;
        unordered_map<int,int> mp;
        for(int num:nums){
            mp[num]++;
        }
        
        for(auto ele:mp){
            if(k==0){
                if(ele.second>1){
                    count++;
                }
            }
            else{
                if(mp.find(ele.first-k)!=mp.end()){
                    count++;
                }
            }
        }
        return count;
    }
};