// TC : O(N) -- Iterating over the array and map 
// SC  :O(N) -- Using the map


class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        int n = nums.size();
        int count =0;
        unordered_map<int,int> mp;
        for(int i=0;i<n;++i){
            mp[nums[i]]++;
        }
        for(auto x : mp){
            if(k==0){
                if(mp[x.first] > 1)
                    count++;
            }
            else{
                if(mp.find(x.first-k) != mp.end())
                    count++;
            }
        }

        return count;
    }
};
