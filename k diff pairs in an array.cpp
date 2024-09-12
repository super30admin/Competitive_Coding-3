//TC-O(N)
//SC-O(N)
class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
       unordered_map<int,int> h;
        for(auto p:nums){
            h[p]++;
        }
        int count=0;
      for(auto num:h){
         if(k==0) {
             if(num.second>1)count++;
      }
          else{
              if(h.find(num.first+k)!=h.end())count++;
          }
      }
        return count;
    }
};