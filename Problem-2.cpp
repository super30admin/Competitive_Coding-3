//Time Complexity = O(N)
//Space Complexity = O(N)
//where N is the elements in the vector nums. 
class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        int i,n,count=0;
        map<int,int> m;
        set<vector<int>> s;
        for(i=0;i<nums.size();i++)
        {
            n=s.size();
            if(m.find(nums[i]+k)!=m.end())
            {
                s.insert({nums[i],nums[i]+k});
                if(n!=s.size())
                {
                    cout<<nums[i]+k<<" "<<nums[i]<<endl;
                    count++;
                }
            }
            n=s.size();
            if(m.find(nums[i]-k)!=m.end())
            {
                s.insert({nums[i]-k,nums[i]});
                if(n!=s.size())
                {
                    cout<<nums[i]-k<<" "<<nums[i]<<endl;
                    count++;
                }
            }
            m[nums[i]]=0;
        }
        return count;
    }
};

//Time Complexity = O(NLogN)
//Space Complexity = O(1)
//where N is the elements in the vector nums. 
class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        int count=0,slow=0,fast=0, n=nums.size();
        sort(nums.begin(),nums.end());
        while(slow<n && fast<n)
        {
            if(slow==fast || nums[fast]-nums[slow]<k) fast++;                       //here we are taking slow==fast in if condition because when k=0, then if we dont increment the fast then the counter will increase since nums[slow]=nums[fast] beacause slow=fast and value subtract with itself gives 0. this will create ambiguity in the code.
            else if(nums[fast]-nums[slow]>k) slow++;
            else { count++;
                  slow++;
                  fast++;
            
            while(fast<n && nums[fast]==nums[fast-1]) fast++;}
        }
        return count;
    }
};
