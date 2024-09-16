// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//approach :1
// use a map  to store latest indices of occurrences of elements while traversing through the nums array.
// in the set , we store our answer pairs.
// as in x - y = k , we want to find x & y located at different index, 
// so  to find out whether they are at different index, we use map by storing index in it.
// in the set, we store our answer, as we want unique pairs.
class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        if(nums.empty() || nums.size()==0){
            return 0;
        }
        unordered_map<int,int>map;
        set<pair<int,int> >set;
        for(int i = 0;i<nums.size();i++)
        {
            map[nums[i]]=i;
        }
        for(int i = 0;i<nums.size();i++)
        {
            int p = nums[i] - k;
            int q = k + nums[i];
            if(map.find(p)!=map.end() && i!=map[p])
            {
                if(nums[i]<nums[map[p]])
                {
                    set.insert({nums[i],nums[map[p]]});
                }
                else{
                    set.insert({nums[map[p]], nums[i]});
                }
            }
            if(map.find(q)!=map.end() && i!=map[q])
            {
                if(nums[i]<nums[map[q]])
                {
                    set.insert({nums[i],nums[map[q]]});
                }
                else{
                    set.insert({nums[map[q]], nums[i]});
                }
            }
        }
        for(auto ele:set){
            cout << ele.first<< "  "<< ele.second<<" ";
        }
        return set.size();
        
    }
};


// Time Complexity : O(nlogn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :
//  using two pointers approach, first we sort the given array.
//  we start at p1=0 and p2=1. and compare diff of arr[p1] & arr[p2] with k.
//   we move the pointers accordingly and increment answer whenever we find a pair.

class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        if(nums.empty() || nums.size()==0){
            return 0;
        }
        sort(nums.begin(),nums.end());
        int p1 = 0, p2 = 1;
        int ans = 0;
        while(p2<nums.size() && p1<nums.size())
        {
            int diff = nums[p2] - nums[p1];
            if( p1==p2 || diff < k)
            {
                p2++;
            }
            else if(diff ==k)
            {
                ans++;p1++;
                while( p1<nums.size() && nums[p1]==nums[p1-1])
                {
                    
                    p1++;
                }
            }
            else
            {
                p1++;
            }
        }
        return ans;
    }
};
