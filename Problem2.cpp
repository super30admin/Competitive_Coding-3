//time :  o(n);
//space : o(1);


class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        
         unordered_map<int,int> map;
        
        
        for(int i =0;i<nums.size();i++) {
            map[nums[i]]++;
        }
        
        int count = 0;
        for(auto mp : map) {
            
            int x1 = mp.first + k;
           
            if( k == 0) {
                if(mp.second > 1) {
                    count++;
                }
            } else {
                if(map.find(x1) != map.end()) {
                    count++;
                }
            }
            
        }
        
        
        return count;
        
    }
};