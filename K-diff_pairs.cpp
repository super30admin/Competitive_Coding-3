TC:O(N);
SC:O(N);

// Approach here to take a frequency map and traverse the map to find nums[i]+k pair if k!=0
// if k==0 check for nums whose freq greater than 1,they also form pairs

class Solution {
public:
    int findPairs(vector<int>& nums, int k) {

      int count=0;
      //  sort(nums.begin(),nums.end());
       unordered_map<int,int>q;

       for(int i=0;i<nums.size();i++)
       q[nums[i]]++;

        for(auto i:q)
        {
          if(k==0)
          {
                 if(i.second>1)
                 count++;
          }
          else if(q.find(i.first+k)!=q.end())
          count++;
        }

        return count;
    } 
};