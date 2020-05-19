// Time Complexity : O(n); 
// Space Complexity : O(n); 
// Did this code successfully run on Leetcode : No
// Any problem you faced while coding this : No


class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        if(!nums.size())
            return 0;
        set<int> mapper;
        int complement, count=0;
        for(auto itr: nums){
            if(mapper.find(itr) == mapper.end()){
                complement = itr-k;
                if(mapper.find(complement) != mapper.end())
                    count++;
                
                complement = itr+k;
                if(mapper.find(complement) != mapper.end())
                    count++;
                mapper.emplace(itr);
            }
        }
        return count;
    }
};