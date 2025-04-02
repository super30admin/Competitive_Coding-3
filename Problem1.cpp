
// Time Complexity : O(n) n is array size
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes 


// Your code here along with comments explaining your approach:
// 1. Use hashset to check if element is present. 
// 2. for each element check (element - k) if yes increase counter.check for k=0 increase counter only if it is present more than once.
// 3. same for (element +k) and in each traverse remove element traversed from hashset.
 
class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        int n=nums.size();
        map<int,int> m;
        for(int i=0;i<n;i++){
            m[nums[i]]++;
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(k==0){
                if(m[nums[i]]>1){
                    c++;
                }
                m[nums[i]]=0;continue;
            }
            if(!m[nums[i]]){
                continue;
            }
            int t=(nums[i] - k);
            int u=(nums[i] + k);
            if(m[t]){
                c++;
            }
            if(m[u]){
                c++;
            }
            m[nums[i]]=0;
        }
        return c;
    }
};