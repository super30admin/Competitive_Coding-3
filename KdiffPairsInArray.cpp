//time complexity: O(n)
//space complexity:O(n)
//approach: using hashmap.
//solved on leetcode? yes
//problem faced? yes, initially got confused but solved it later

class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        if(nums.size()==0)
            return 0;
        int count=0;
        map<int,int>map;
        for(auto el:nums)
        {
            map[el]++;
        }
        for(auto x:map)
        {
            int val=x.first+k;
            if(map.find(val)!=map.end())
            {
                if(val==x.first && x.second>1)
                    count++;
                else if(val!=x.first && x.second>=1)
                    count++;
            }
        }
        return count;
    }
};