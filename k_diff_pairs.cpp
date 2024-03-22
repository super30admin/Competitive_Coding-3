class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        unordered_map <int,int> hash_map;
        int ans=0;
        int i;
        for(i=0;i<nums.size();i++)
        {
            hash_map[nums[i]]++;
        }
        for(auto pair: hash_map)
        {
          if((k==0)&&(pair.second>1))
          {
          ans++;
          }
          else
          {
              if(hash_map.find(pair.first-k)!=hash_map.end()&&k>0)
              ans++;
          }
        }
      return ans;  
    }
};