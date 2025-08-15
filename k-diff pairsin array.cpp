class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        if (k<0) return 0;
        unordered_map<int,int>map;
        for(int i :nums)
        map[i]++;
        int count =0;
        for(auto it =map.begin();it!=map.end();it++)
        {
           if(k==0) 
           {
             if(it->second>=2)
              count++;
           }
           else{  
           if(map.count(it->first + k))
            count++;
           }
        } 
        return count;

    }
};