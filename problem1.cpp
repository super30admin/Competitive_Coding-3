//Time Complexity - O(N)
//Space complexity - O(N)
class Solution {
public:
    int findPairs(vector<int>& nums, int k) {
        map<pair<int,int>,int>m1;
        unordered_map<int,int>m2;
        int n=nums.size(),i;
        for(i=0;i<n;i++){
            m2[nums[i]]++;
        }
        for(i=0;i<n;i++){
            if(nums[i]-k!=nums[i]){
            if(m2[nums[i]-k]>0){
                m1[{nums[i],nums[i]-k}]=1;
            }
            }
            else if(nums[i]-k==nums[i]){
                if(m2[nums[i]]>1){
                    m1[{nums[i],nums[i]}]=1;
                }
            }
        }
        return m1.size();
    }
};